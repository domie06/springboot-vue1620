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


import com.dao.DiscusswangkekechengDao;
import com.entity.DiscusswangkekechengEntity;
import com.service.DiscusswangkekechengService;
import com.entity.vo.DiscusswangkekechengVO;
import com.entity.view.DiscusswangkekechengView;

@Service("discusswangkekechengService")
public class DiscusswangkekechengServiceImpl extends ServiceImpl<DiscusswangkekechengDao, DiscusswangkekechengEntity> implements DiscusswangkekechengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswangkekechengEntity> page = this.selectPage(
                new Query<DiscusswangkekechengEntity>(params).getPage(),
                new EntityWrapper<DiscusswangkekechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswangkekechengEntity> wrapper) {
		  Page<DiscusswangkekechengView> page =new Query<DiscusswangkekechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswangkekechengVO> selectListVO(Wrapper<DiscusswangkekechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswangkekechengVO selectVO(Wrapper<DiscusswangkekechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswangkekechengView> selectListView(Wrapper<DiscusswangkekechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswangkekechengView selectView(Wrapper<DiscusswangkekechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
