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
 * 案件进展
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
@TableName("anjianjinzhan")
public class AnjianjinzhanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public AnjianjinzhanEntity() {
		
	}
	
	public AnjianjinzhanEntity(T t) {
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
	 * 案件编号
	 */
					
	private String anjianbianhao;
	
	/**
	 * 报案名称
	 */
					
	private String baoanmingcheng;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 进展图片
	 */
					
	private String jinzhantupian;
	
	/**
	 * 进展状态
	 */
					
	private String jinzhanzhuangtai;
	
	/**
	 * 进展内容
	 */
					
	private String jinzhanneirong;
	
	/**
	 * 警号
	 */
					
	private String jinghao;
	
	/**
	 * 警察姓名
	 */
					
	private String jingchaxingming;
	
	/**
	 * 更新日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date gengxinriqi;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：案件编号
	 */
	public void setAnjianbianhao(String anjianbianhao) {
		this.anjianbianhao = anjianbianhao;
	}
	/**
	 * 获取：案件编号
	 */
	public String getAnjianbianhao() {
		return anjianbianhao;
	}
	/**
	 * 设置：报案名称
	 */
	public void setBaoanmingcheng(String baoanmingcheng) {
		this.baoanmingcheng = baoanmingcheng;
	}
	/**
	 * 获取：报案名称
	 */
	public String getBaoanmingcheng() {
		return baoanmingcheng;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：进展图片
	 */
	public void setJinzhantupian(String jinzhantupian) {
		this.jinzhantupian = jinzhantupian;
	}
	/**
	 * 获取：进展图片
	 */
	public String getJinzhantupian() {
		return jinzhantupian;
	}
	/**
	 * 设置：进展状态
	 */
	public void setJinzhanzhuangtai(String jinzhanzhuangtai) {
		this.jinzhanzhuangtai = jinzhanzhuangtai;
	}
	/**
	 * 获取：进展状态
	 */
	public String getJinzhanzhuangtai() {
		return jinzhanzhuangtai;
	}
	/**
	 * 设置：进展内容
	 */
	public void setJinzhanneirong(String jinzhanneirong) {
		this.jinzhanneirong = jinzhanneirong;
	}
	/**
	 * 获取：进展内容
	 */
	public String getJinzhanneirong() {
		return jinzhanneirong;
	}
	/**
	 * 设置：警号
	 */
	public void setJinghao(String jinghao) {
		this.jinghao = jinghao;
	}
	/**
	 * 获取：警号
	 */
	public String getJinghao() {
		return jinghao;
	}
	/**
	 * 设置：警察姓名
	 */
	public void setJingchaxingming(String jingchaxingming) {
		this.jingchaxingming = jingchaxingming;
	}
	/**
	 * 获取：警察姓名
	 */
	public String getJingchaxingming() {
		return jingchaxingming;
	}
	/**
	 * 设置：更新日期
	 */
	public void setGengxinriqi(Date gengxinriqi) {
		this.gengxinriqi = gengxinriqi;
	}
	/**
	 * 获取：更新日期
	 */
	public Date getGengxinriqi() {
		return gengxinriqi;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
