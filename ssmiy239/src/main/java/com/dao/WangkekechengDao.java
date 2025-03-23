package com.dao;

import com.entity.WangkekechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WangkekechengVO;
import com.entity.view.WangkekechengView;


/**
 * 网课课程
 * 
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
public interface WangkekechengDao extends BaseMapper<WangkekechengEntity> {
	
	List<WangkekechengVO> selectListVO(@Param("ew") Wrapper<WangkekechengEntity> wrapper);
	
	WangkekechengVO selectVO(@Param("ew") Wrapper<WangkekechengEntity> wrapper);
	
	List<WangkekechengView> selectListView(@Param("ew") Wrapper<WangkekechengEntity> wrapper);

	List<WangkekechengView> selectListView(Pagination page,@Param("ew") Wrapper<WangkekechengEntity> wrapper);
	
	WangkekechengView selectView(@Param("ew") Wrapper<WangkekechengEntity> wrapper);
	
}
