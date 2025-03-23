package com.entity.view;

import com.entity.WangkekechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 网课课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
@TableName("wangkekecheng")
public class WangkekechengView  extends WangkekechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WangkekechengView(){
	}
 
 	public WangkekechengView(WangkekechengEntity wangkekechengEntity){
 	try {
			BeanUtils.copyProperties(this, wangkekechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
