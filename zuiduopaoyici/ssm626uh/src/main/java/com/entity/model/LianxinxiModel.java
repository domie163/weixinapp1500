package com.entity.model;

import com.entity.LianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 立案信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
public class LianxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	
	private String zhuanzhangjine;
		
	/**
	 * 转账次数
	 */
	
	private String zhuanzhangcishu;
		
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
	
	private String zhuanchushijian;
		
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
	
	private String shenqingriqi;
		
	/**
	 * 警号
	 */
	
	private String jinghao;
		
	/**
	 * 警察姓名
	 */
	
	private String jingchaxingming;
		
	/**
	 * 立案时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date lianshijian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 
	public void setZhuanzhangjine(String zhuanzhangjine) {
		this.zhuanzhangjine = zhuanzhangjine;
	}
	
	/**
	 * 获取：转账金额
	 */
	public String getZhuanzhangjine() {
		return zhuanzhangjine;
	}
				
	
	/**
	 * 设置：转账次数
	 */
	 
	public void setZhuanzhangcishu(String zhuanzhangcishu) {
		this.zhuanzhangcishu = zhuanzhangcishu;
	}
	
	/**
	 * 获取：转账次数
	 */
	public String getZhuanzhangcishu() {
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
	 
	public void setZhuanchushijian(String zhuanchushijian) {
		this.zhuanchushijian = zhuanchushijian;
	}
	
	/**
	 * 获取：转出时间
	 */
	public String getZhuanchushijian() {
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
	 
	public void setShenqingriqi(String shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public String getShenqingriqi() {
		return shenqingriqi;
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
	 * 设置：立案时间
	 */
	 
	public void setLianshijian(Date lianshijian) {
		this.lianshijian = lianshijian;
	}
	
	/**
	 * 获取：立案时间
	 */
	public Date getLianshijian() {
		return lianshijian;
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
