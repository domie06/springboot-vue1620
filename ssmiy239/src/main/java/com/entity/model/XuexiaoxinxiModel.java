package com.entity.model;

import com.entity.XuexiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学校信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
public class XuexiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所在地区
	 */
	
	private String suozaidiqu;
		
	/**
	 * 学校地址
	 */
	
	private String xuexiaodizhi;
		
	/**
	 * 学校图片
	 */
	
	private String xuexiaotupian;
		
	/**
	 * 占地面积
	 */
	
	private String zhandimianji;
		
	/**
	 * 人员数量
	 */
	
	private String renyuanshuliang;
		
	/**
	 * 学校介绍
	 */
	
	private String xuexiaojieshao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：所在地区
	 */
	 
	public void setSuozaidiqu(String suozaidiqu) {
		this.suozaidiqu = suozaidiqu;
	}
	
	/**
	 * 获取：所在地区
	 */
	public String getSuozaidiqu() {
		return suozaidiqu;
	}
				
	
	/**
	 * 设置：学校地址
	 */
	 
	public void setXuexiaodizhi(String xuexiaodizhi) {
		this.xuexiaodizhi = xuexiaodizhi;
	}
	
	/**
	 * 获取：学校地址
	 */
	public String getXuexiaodizhi() {
		return xuexiaodizhi;
	}
				
	
	/**
	 * 设置：学校图片
	 */
	 
	public void setXuexiaotupian(String xuexiaotupian) {
		this.xuexiaotupian = xuexiaotupian;
	}
	
	/**
	 * 获取：学校图片
	 */
	public String getXuexiaotupian() {
		return xuexiaotupian;
	}
				
	
	/**
	 * 设置：占地面积
	 */
	 
	public void setZhandimianji(String zhandimianji) {
		this.zhandimianji = zhandimianji;
	}
	
	/**
	 * 获取：占地面积
	 */
	public String getZhandimianji() {
		return zhandimianji;
	}
				
	
	/**
	 * 设置：人员数量
	 */
	 
	public void setRenyuanshuliang(String renyuanshuliang) {
		this.renyuanshuliang = renyuanshuliang;
	}
	
	/**
	 * 获取：人员数量
	 */
	public String getRenyuanshuliang() {
		return renyuanshuliang;
	}
				
	
	/**
	 * 设置：学校介绍
	 */
	 
	public void setXuexiaojieshao(String xuexiaojieshao) {
		this.xuexiaojieshao = xuexiaojieshao;
	}
	
	/**
	 * 获取：学校介绍
	 */
	public String getXuexiaojieshao() {
		return xuexiaojieshao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
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
