package com.entity.view;

import com.entity.LianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 立案信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
@TableName("lianxinxi")
public class LianxinxiView  extends LianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LianxinxiView(){
	}
 
 	public LianxinxiView(LianxinxiEntity lianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, lianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
