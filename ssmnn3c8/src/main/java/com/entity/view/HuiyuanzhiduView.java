package com.entity.view;

import com.entity.HuiyuanzhiduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员制度
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-22 23:39:14
 */
@TableName("huiyuanzhidu")
public class HuiyuanzhiduView  extends HuiyuanzhiduEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanzhiduView(){
	}
 
 	public HuiyuanzhiduView(HuiyuanzhiduEntity huiyuanzhiduEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanzhiduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
