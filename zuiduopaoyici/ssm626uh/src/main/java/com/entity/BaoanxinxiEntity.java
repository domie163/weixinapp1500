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
 * 报案信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
@TableName("baoanxinxi")
public class BaoanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaoanxinxiEntity() {
		
	}
	
	public BaoanxinxiEntity(T t) {
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
	 * 申请编号
	 */
					
	private String shenqingbianhao;
	
	/**
	 * 报案名称
	 */
					
	private String baoanmingcheng;
	
	/**
	 * 报案内容
	 */
					
	private String baoanneirong;
	
	/**
	 * 转账金额
	 */
					
	private Integer zhuanzhangjine;
	
	/**
	 * 转账次数
	 */
					
	private Integer zhuanzhangcishu;
	
	/**
	 * 转出账号
	 */
					
	private String zhuanchuzhanghao;
	
	/**
	 * 对方账号
	 */
					
	private String duifangzhanghao;
	
	/**
	 * 转账凭证
	 */
					
	private String zhuanzhangpingzheng;
	
	/**
	 * 转出时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date zhuanchushijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 申请日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenqingriqi;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
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
	 * 设置：申请编号
	 */
	public void setShenqingbianhao(String shenqingbianhao) {
		this.shenqingbianhao = shenqingbianhao;
	}
	/**
	 * 获取：申请编号
	 */
	public String getShenqingbianhao() {
		return shenqingbianhao;
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
	 * 设置：报案内容
	 */
	public void setBaoanneirong(String baoanneirong) {
		this.baoanneirong = baoanneirong;
	}
	/**
	 * 获取：报案内容
	 */
	public String getBaoanneirong() {
		return baoanneirong;
	}
	/**
	 * 设置：转账金额
	 */
	public void setZhuanzhangjine(Integer zhuanzhangjine) {
		this.zhuanzhangjine = zhuanzhangjine;
	}
	/**
	 * 获取：转账金额
	 */
	public Integer getZhuanzhangjine() {
		return zhuanzhangjine;
	}
	/**
	 * 设置：转账次数
	 */
	public void setZhuanzhangcishu(Integer zhuanzhangcishu) {
		this.zhuanzhangcishu = zhuanzhangcishu;
	}
	/**
	 * 获取：转账次数
	 */
	public Integer getZhuanzhangcishu() {
		return zhuanzhangcishu;
	}
	/**
	 * 设置：转出账号
	 */
	public void setZhuanchuzhanghao(String zhuanchuzhanghao) {
		this.zhuanchuzhanghao = zhuanchuzhanghao;
	}
	/**
	 * 获取：转出账号
	 */
	public String getZhuanchuzhanghao() {
		return zhuanchuzhanghao;
	}
	/**
	 * 设置：对方账号
	 */
	public void setDuifangzhanghao(String duifangzhanghao) {
		this.duifangzhanghao = duifangzhanghao;
	}
	/**
	 * 获取：对方账号
	 */
	public String getDuifangzhanghao() {
		return duifangzhanghao;
	}
	/**
	 * 设置：转账凭证
	 */
	public void setZhuanzhangpingzheng(String zhuanzhangpingzheng) {
		this.zhuanzhangpingzheng = zhuanzhangpingzheng;
	}
	/**
	 * 获取：转账凭证
	 */
	public String getZhuanzhangpingzheng() {
		return zhuanzhangpingzheng;
	}
	/**
	 * 设置：转出时间
	 */
	public void setZhuanchushijian(Date zhuanchushijian) {
		this.zhuanchushijian = zhuanchushijian;
	}
	/**
	 * 获取：转出时间
	 */
	public Date getZhuanchushijian() {
		return zhuanchushijian;
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
	 * 设置：申请日期
	 */
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
