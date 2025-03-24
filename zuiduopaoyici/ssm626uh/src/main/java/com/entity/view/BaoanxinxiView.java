package com.entity.view;

import com.entity.BaoanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报案信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
@TableName("baoanxinxi")
public class BaoanxinxiView  extends BaoanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoanxinxiView(){
	}
 
 	public BaoanxinxiView(BaoanxinxiEntity baoanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, baoanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
