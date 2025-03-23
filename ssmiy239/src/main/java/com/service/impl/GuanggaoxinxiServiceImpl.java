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


import com.dao.GuanggaoxinxiDao;
import com.entity.GuanggaoxinxiEntity;
import com.service.GuanggaoxinxiService;
import com.entity.vo.GuanggaoxinxiVO;
import com.entity.view.GuanggaoxinxiView;

@Service("guanggaoxinxiService")
public class GuanggaoxinxiServiceImpl extends ServiceImpl<GuanggaoxinxiDao, GuanggaoxinxiEntity> implements GuanggaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaoxinxiEntity> page = this.selectPage(
                new Query<GuanggaoxinxiEntity>(params).getPage(),
                new EntityWrapper<GuanggaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaoxinxiEntity> wrapper) {
		  Page<GuanggaoxinxiView> page =new Query<GuanggaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaoxinxiVO> selectListVO(Wrapper<GuanggaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaoxinxiVO selectVO(Wrapper<GuanggaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaoxinxiView> selectListView(Wrapper<GuanggaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaoxinxiView selectView(Wrapper<GuanggaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
