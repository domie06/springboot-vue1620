package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaoxinxiView;


/**
 * 广告信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
public interface GuanggaoxinxiService extends IService<GuanggaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaoxinxiVO> selectListVO(Wrapper<GuanggaoxinxiEntity> wrapper);
   	
   	GuanggaoxinxiVO selectVO(@Param("ew") Wrapper<GuanggaoxinxiEntity> wrapper);
   	
   	List<GuanggaoxinxiView> selectListView(Wrapper<GuanggaoxinxiEntity> wrapper);
   	
   	GuanggaoxinxiView selectView(@Param("ew") Wrapper<GuanggaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaoxinxiEntity> wrapper);
   	
}

