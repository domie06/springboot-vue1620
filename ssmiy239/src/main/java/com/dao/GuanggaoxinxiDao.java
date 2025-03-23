package com.dao;

import com.entity.GuanggaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaoxinxiVO;
import com.entity.view.GuanggaoxinxiView;


/**
 * 广告信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
public interface GuanggaoxinxiDao extends BaseMapper<GuanggaoxinxiEntity> {
	
	List<GuanggaoxinxiVO> selectListVO(@Param("ew") Wrapper<GuanggaoxinxiEntity> wrapper);
	
	GuanggaoxinxiVO selectVO(@Param("ew") Wrapper<GuanggaoxinxiEntity> wrapper);
	
	List<GuanggaoxinxiView> selectListView(@Param("ew") Wrapper<GuanggaoxinxiEntity> wrapper);

	List<GuanggaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaoxinxiEntity> wrapper);
	
	GuanggaoxinxiView selectView(@Param("ew") Wrapper<GuanggaoxinxiEntity> wrapper);
	
}
