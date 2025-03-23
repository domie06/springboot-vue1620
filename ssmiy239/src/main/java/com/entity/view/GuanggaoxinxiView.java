package com.entity.view;

import com.entity.GuanggaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 广告信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
@TableName("guanggaoxinxi")
public class GuanggaoxinxiView  extends GuanggaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuanggaoxinxiView(){
	}
 
 	public GuanggaoxinxiView(GuanggaoxinxiEntity guanggaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, guanggaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
