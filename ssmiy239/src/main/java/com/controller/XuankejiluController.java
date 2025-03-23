package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XuankejiluEntity;
import com.entity.view.XuankejiluView;

import com.service.XuankejiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 选课记录
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
@RestController
@RequestMapping("/xuankejilu")
public class XuankejiluController {
    @Autowired
    private XuankejiluService xuankejiluService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuankejiluEntity xuankejilu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			xuankejilu.setLaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			xuankejilu.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuankejiluEntity> ew = new EntityWrapper<XuankejiluEntity>();
		PageUtils page = xuankejiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuankejilu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuankejiluEntity xuankejilu, 
		HttpServletRequest request){
        EntityWrapper<XuankejiluEntity> ew = new EntityWrapper<XuankejiluEntity>();
		PageUtils page = xuankejiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuankejilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuankejiluEntity xuankejilu){
       	EntityWrapper<XuankejiluEntity> ew = new EntityWrapper<XuankejiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuankejilu, "xuankejilu")); 
        return R.ok().put("data", xuankejiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuankejiluEntity xuankejilu){
        EntityWrapper< XuankejiluEntity> ew = new EntityWrapper< XuankejiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuankejilu, "xuankejilu")); 
		XuankejiluView xuankejiluView =  xuankejiluService.selectView(ew);
		return R.ok("查询选课记录成功").put("data", xuankejiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuankejiluEntity xuankejilu = xuankejiluService.selectById(id);
        return R.ok().put("data", xuankejilu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuankejiluEntity xuankejilu = xuankejiluService.selectById(id);
        return R.ok().put("data", xuankejilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuankejiluEntity xuankejilu, HttpServletRequest request){
    	xuankejilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuankejilu);

        xuankejiluService.insert(xuankejilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuankejiluEntity xuankejilu, HttpServletRequest request){
    	xuankejilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuankejilu);

        xuankejiluService.insert(xuankejilu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XuankejiluEntity xuankejilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuankejilu);
        xuankejiluService.updateById(xuankejilu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuankejiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XuankejiluEntity> wrapper = new EntityWrapper<XuankejiluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			wrapper.eq("laoshigonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = xuankejiluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
