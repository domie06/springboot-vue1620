package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WangkekechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WangkekechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WangkekechengView;


/**
 * 网课课程
 *
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
public interface WangkekechengService extends IService<WangkekechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WangkekechengVO> selectListVO(Wrapper<WangkekechengEntity> wrapper);
   	
   	WangkekechengVO selectVO(@Param("ew") Wrapper<WangkekechengEntity> wrapper);
   	
   	List<WangkekechengView> selectListView(Wrapper<WangkekechengEntity> wrapper);
   	
   	WangkekechengView selectView(@Param("ew") Wrapper<WangkekechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WangkekechengEntity> wrapper);
   	
}

