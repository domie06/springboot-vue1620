package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuankejiluDao;
import com.entity.XuankejiluEntity;
import com.service.XuankejiluService;
import com.entity.vo.XuankejiluVO;
import com.entity.view.XuankejiluView;

@Service("xuankejiluService")
public class XuankejiluServiceImpl extends ServiceImpl<XuankejiluDao, XuankejiluEntity> implements XuankejiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuankejiluEntity> page = this.selectPage(
                new Query<XuankejiluEntity>(params).getPage(),
                new EntityWrapper<XuankejiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuankejiluEntity> wrapper) {
		  Page<XuankejiluView> page =new Query<XuankejiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuankejiluVO> selectListVO(Wrapper<XuankejiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuankejiluVO selectVO(Wrapper<XuankejiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuankejiluView> selectListView(Wrapper<XuankejiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuankejiluView selectView(Wrapper<XuankejiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
