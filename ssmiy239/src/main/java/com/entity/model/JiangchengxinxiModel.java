package com.entity.model;

import com.entity.JiangchengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 奖惩信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
public class JiangchengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 获奖时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huojiangshijian;
		
	/**
	 * 获奖内容
	 */
	
	private String huojiangneirong;
		
	/**
	 * 惩罚时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chengfashijian;
		
	/**
	 * 惩罚内容
	 */
	
	private String chengfaneirong;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：获奖时间
	 */
	 
	public void setHuojiangshijian(Date huojiangshijian) {
		this.huojiangshijian = huojiangshijian;
	}
	
	/**
	 * 获取：获奖时间
	 */
	public Date getHuojiangshijian() {
		return huojiangshijian;
	}
				
	
	/**
	 * 设置：获奖内容
	 */
	 
	public void setHuojiangneirong(String huojiangneirong) {
		this.huojiangneirong = huojiangneirong;
	}
	
	/**
	 * 获取：获奖内容
	 */
	public String getHuojiangneirong() {
		return huojiangneirong;
	}
				
	
	/**
	 * 设置：惩罚时间
	 */
	 
	public void setChengfashijian(Date chengfashijian) {
		this.chengfashijian = chengfashijian;
	}
	
	/**
	 * 获取：惩罚时间
	 */
	public Date getChengfashijian() {
		return chengfashijian;
	}
				
	
	/**
	 * 设置：惩罚内容
	 */
	 
	public void setChengfaneirong(String chengfaneirong) {
		this.chengfaneirong = chengfaneirong;
	}
	
	/**
	 * 获取：惩罚内容
	 */
	public String getChengfaneirong() {
		return chengfaneirong;
	}
			
}
