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


import com.dao.DiscussguanggaoxinxiDao;
import com.entity.DiscussguanggaoxinxiEntity;
import com.service.DiscussguanggaoxinxiService;
import com.entity.vo.DiscussguanggaoxinxiVO;
import com.entity.view.DiscussguanggaoxinxiView;

@Service("discussguanggaoxinxiService")
public class DiscussguanggaoxinxiServiceImpl extends ServiceImpl<DiscussguanggaoxinxiDao, DiscussguanggaoxinxiEntity> implements DiscussguanggaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussguanggaoxinxiEntity> page = this.selectPage(
                new Query<DiscussguanggaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussguanggaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussguanggaoxinxiEntity> wrapper) {
		  Page<DiscussguanggaoxinxiView> page =new Query<DiscussguanggaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussguanggaoxinxiVO> selectListVO(Wrapper<DiscussguanggaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussguanggaoxinxiVO selectVO(Wrapper<DiscussguanggaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussguanggaoxinxiView> selectListView(Wrapper<DiscussguanggaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussguanggaoxinxiView selectView(Wrapper<DiscussguanggaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
