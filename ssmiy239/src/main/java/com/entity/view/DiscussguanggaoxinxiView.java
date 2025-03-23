package com.entity.view;

import com.entity.DiscussguanggaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 广告信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 19:43:59
 */
@TableName("discussguanggaoxinxi")
public class DiscussguanggaoxinxiView  extends DiscussguanggaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussguanggaoxinxiView(){
	}
 
 	public DiscussguanggaoxinxiView(DiscussguanggaoxinxiEntity discussguanggaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussguanggaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
