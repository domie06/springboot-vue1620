package com.dao;

import com.entity.DiscussguanggaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussguanggaoxinxiVO;
import com.entity.view.DiscussguanggaoxinxiView;


/**
 * 广告信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-26 19:43:59
 */
public interface DiscussguanggaoxinxiDao extends BaseMapper<DiscussguanggaoxinxiEntity> {
	
	List<DiscussguanggaoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussguanggaoxinxiEntity> wrapper);
	
	DiscussguanggaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussguanggaoxinxiEntity> wrapper);
	
	List<DiscussguanggaoxinxiView> selectListView(@Param("ew") Wrapper<DiscussguanggaoxinxiEntity> wrapper);

	List<DiscussguanggaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussguanggaoxinxiEntity> wrapper);
	
	DiscussguanggaoxinxiView selectView(@Param("ew") Wrapper<DiscussguanggaoxinxiEntity> wrapper);
	
}
