package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussguanggaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussguanggaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussguanggaoxinxiView;


/**
 * 广告信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-26 19:43:59
 */
public interface DiscussguanggaoxinxiService extends IService<DiscussguanggaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussguanggaoxinxiVO> selectListVO(Wrapper<DiscussguanggaoxinxiEntity> wrapper);
   	
   	DiscussguanggaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussguanggaoxinxiEntity> wrapper);
   	
   	List<DiscussguanggaoxinxiView> selectListView(Wrapper<DiscussguanggaoxinxiEntity> wrapper);
   	
   	DiscussguanggaoxinxiView selectView(@Param("ew") Wrapper<DiscussguanggaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussguanggaoxinxiEntity> wrapper);
   	
}

