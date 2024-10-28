package com.entity.view;

import com.entity.JingpaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 竞拍信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 12:57:51
 */
@TableName("jingpaixinxi")
public class JingpaixinxiView  extends JingpaixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingpaixinxiView(){
	}
 
 	public JingpaixinxiView(JingpaixinxiEntity jingpaixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jingpaixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
