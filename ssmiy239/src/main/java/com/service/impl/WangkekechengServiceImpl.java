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


import com.dao.WangkekechengDao;
import com.entity.WangkekechengEntity;
import com.service.WangkekechengService;
import com.entity.vo.WangkekechengVO;
import com.entity.view.WangkekechengView;

@Service("wangkekechengService")
public class WangkekechengServiceImpl extends ServiceImpl<WangkekechengDao, WangkekechengEntity> implements WangkekechengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WangkekechengEntity> page = this.selectPage(
                new Query<WangkekechengEntity>(params).getPage(),
                new EntityWrapper<WangkekechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WangkekechengEntity> wrapper) {
		  Page<WangkekechengView> page =new Query<WangkekechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WangkekechengVO> selectListVO(Wrapper<WangkekechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WangkekechengVO selectVO(Wrapper<WangkekechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WangkekechengView> selectListView(Wrapper<WangkekechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WangkekechengView selectView(Wrapper<WangkekechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
