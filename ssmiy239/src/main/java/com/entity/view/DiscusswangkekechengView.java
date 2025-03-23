package com.entity.view;

import com.entity.DiscusswangkekechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 网课课程评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 19:43:59
 */
@TableName("discusswangkekecheng")
public class DiscusswangkekechengView  extends DiscusswangkekechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusswangkekechengView(){
	}
 
 	public DiscusswangkekechengView(DiscusswangkekechengEntity discusswangkekechengEntity){
 	try {
			BeanUtils.copyProperties(this, discusswangkekechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
