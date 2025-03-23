package com.dao;

import com.entity.XuankejiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuankejiluVO;
import com.entity.view.XuankejiluView;


/**
 * 选课记录
 * 
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
public interface XuankejiluDao extends BaseMapper<XuankejiluEntity> {
	
	List<XuankejiluVO> selectListVO(@Param("ew") Wrapper<XuankejiluEntity> wrapper);
	
	XuankejiluVO selectVO(@Param("ew") Wrapper<XuankejiluEntity> wrapper);
	
	List<XuankejiluView> selectListView(@Param("ew") Wrapper<XuankejiluEntity> wrapper);

	List<XuankejiluView> selectListView(Pagination page,@Param("ew") Wrapper<XuankejiluEntity> wrapper);
	
	XuankejiluView selectView(@Param("ew") Wrapper<XuankejiluEntity> wrapper);
	
}
