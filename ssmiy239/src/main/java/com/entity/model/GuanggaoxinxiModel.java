package com.entity.model;

import com.entity.GuanggaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 广告信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
public class GuanggaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 广告图片
	 */
	
	private String guanggaotupian;
		
	/**
	 * 广告类别
	 */
	
	private String guanggaoleibie;
		
	/**
	 * 广告内容
	 */
	
	private String guanggaoneirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：广告图片
	 */
	 
	public void setGuanggaotupian(String guanggaotupian) {
		this.guanggaotupian = guanggaotupian;
	}
	
	/**
	 * 获取：广告图片
	 */
	public String getGuanggaotupian() {
		return guanggaotupian;
	}
				
	
	/**
	 * 设置：广告类别
	 */
	 
	public void setGuanggaoleibie(String guanggaoleibie) {
		this.guanggaoleibie = guanggaoleibie;
	}
	
	/**
	 * 获取：广告类别
	 */
	public String getGuanggaoleibie() {
		return guanggaoleibie;
	}
				
	
	/**
	 * 设置：广告内容
	 */
	 
	public void setGuanggaoneirong(String guanggaoneirong) {
		this.guanggaoneirong = guanggaoneirong;
	}
	
	/**
	 * 获取：广告内容
	 */
	public String getGuanggaoneirong() {
		return guanggaoneirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
