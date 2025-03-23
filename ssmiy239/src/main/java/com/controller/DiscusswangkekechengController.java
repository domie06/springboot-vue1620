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

import com.entity.DiscusswangkekechengEntity;
import com.entity.view.DiscusswangkekechengView;

import com.service.DiscusswangkekechengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 网课课程评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 19:43:59
 */
@RestController
@RequestMapping("/discusswangkekecheng")
public class DiscusswangkekechengController {
    @Autowired
    private DiscusswangkekechengService discusswangkekechengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusswangkekechengEntity discusswangkekecheng, 
		HttpServletRequest request){

        EntityWrapper<DiscusswangkekechengEntity> ew = new EntityWrapper<DiscusswangkekechengEntity>();
		PageUtils page = discusswangkekechengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusswangkekecheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusswangkekechengEntity discusswangkekecheng, 
		HttpServletRequest request){
        EntityWrapper<DiscusswangkekechengEntity> ew = new EntityWrapper<DiscusswangkekechengEntity>();
		PageUtils page = discusswangkekechengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusswangkekecheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusswangkekechengEntity discusswangkekecheng){
       	EntityWrapper<DiscusswangkekechengEntity> ew = new EntityWrapper<DiscusswangkekechengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusswangkekecheng, "discusswangkekecheng")); 
        return R.ok().put("data", discusswangkekechengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusswangkekechengEntity discusswangkekecheng){
        EntityWrapper< DiscusswangkekechengEntity> ew = new EntityWrapper< DiscusswangkekechengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusswangkekecheng, "discusswangkekecheng")); 
		DiscusswangkekechengView discusswangkekechengView =  discusswangkekechengService.selectView(ew);
		return R.ok("查询网课课程评论表成功").put("data", discusswangkekechengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusswangkekechengEntity discusswangkekecheng = discusswangkekechengService.selectById(id);
        return R.ok().put("data", discusswangkekecheng);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusswangkekechengEntity discusswangkekecheng = discusswangkekechengService.selectById(id);
        return R.ok().put("data", discusswangkekecheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusswangkekechengEntity discusswangkekecheng, HttpServletRequest request){
    	discusswangkekecheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusswangkekecheng);

        discusswangkekechengService.insert(discusswangkekecheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusswangkekechengEntity discusswangkekecheng, HttpServletRequest request){
    	discusswangkekecheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusswangkekecheng);

        discusswangkekechengService.insert(discusswangkekecheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusswangkekechengEntity discusswangkekecheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusswangkekecheng);
        discusswangkekechengService.updateById(discusswangkekecheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusswangkekechengService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DiscusswangkekechengEntity> wrapper = new EntityWrapper<DiscusswangkekechengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusswangkekechengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
