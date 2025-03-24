package com.entity.view;

import com.entity.MinjingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 民警
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
@TableName("minjing")
public class MinjingView  extends MinjingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MinjingView(){
	}
 
 	public MinjingView(MinjingEntity minjingEntity){
 	try {
			BeanUtils.copyProperties(this, minjingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
