package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswangkekechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswangkekechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswangkekechengView;


/**
 * 网课课程评论表
 *
 * @author 
 * @email 
 * @date 2021-04-26 19:43:59
 */
public interface DiscusswangkekechengService extends IService<DiscusswangkekechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswangkekechengVO> selectListVO(Wrapper<DiscusswangkekechengEntity> wrapper);
   	
   	DiscusswangkekechengVO selectVO(@Param("ew") Wrapper<DiscusswangkekechengEntity> wrapper);
   	
   	List<DiscusswangkekechengView> selectListView(Wrapper<DiscusswangkekechengEntity> wrapper);
   	
   	DiscusswangkekechengView selectView(@Param("ew") Wrapper<DiscusswangkekechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswangkekechengEntity> wrapper);
   	
}

