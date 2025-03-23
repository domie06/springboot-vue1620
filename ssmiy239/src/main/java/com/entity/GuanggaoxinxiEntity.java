package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 广告信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 19:43:58
 */
@TableName("guanggaoxinxi")
public class GuanggaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuanggaoxinxiEntity() {
		
	}
	
	public GuanggaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 广告标题
	 */
					
	private String guanggaobiaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：广告标题
	 */
	public void setGuanggaobiaoti(String guanggaobiaoti) {
		this.guanggaobiaoti = guanggaobiaoti;
	}
	/**
	 * 获取：广告标题
	 */
	public String getGuanggaobiaoti() {
		return guanggaobiaoti;
	}
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
