package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuankejiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuankejiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuankejiluView;


/**
 * 选课记录
 *
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
public interface XuankejiluService extends IService<XuankejiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuankejiluVO> selectListVO(Wrapper<XuankejiluEntity> wrapper);
   	
   	XuankejiluVO selectVO(@Param("ew") Wrapper<XuankejiluEntity> wrapper);
   	
   	List<XuankejiluView> selectListView(Wrapper<XuankejiluEntity> wrapper);
   	
   	XuankejiluView selectView(@Param("ew") Wrapper<XuankejiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuankejiluEntity> wrapper);
   	
}

