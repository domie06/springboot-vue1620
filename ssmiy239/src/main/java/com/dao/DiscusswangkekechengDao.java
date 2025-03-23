package com.dao;

import com.entity.DiscusswangkekechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswangkekechengVO;
import com.entity.view.DiscusswangkekechengView;


/**
 * 网课课程评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-26 19:43:59
 */
public interface DiscusswangkekechengDao extends BaseMapper<DiscusswangkekechengEntity> {
	
	List<DiscusswangkekechengVO> selectListVO(@Param("ew") Wrapper<DiscusswangkekechengEntity> wrapper);
	
	DiscusswangkekechengVO selectVO(@Param("ew") Wrapper<DiscusswangkekechengEntity> wrapper);
	
	List<DiscusswangkekechengView> selectListView(@Param("ew") Wrapper<DiscusswangkekechengEntity> wrapper);

	List<DiscusswangkekechengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswangkekechengEntity> wrapper);
	
	DiscusswangkekechengView selectView(@Param("ew") Wrapper<DiscusswangkekechengEntity> wrapper);
	
}
