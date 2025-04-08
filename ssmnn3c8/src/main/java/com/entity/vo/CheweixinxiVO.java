package com.entity.vo;

import com.entity.CheweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 车位信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-22 23:39:14
 */
public class CheweixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 区域
	 */
	
	private String quyu;
		
	/**
	 * 车位状态
	 */
	
	private String cheweizhuangtai;
		
	/**
	 * 小时计费
	 */
	
	private Integer xiaoshijifei;
		
	/**
	 * 停放须知
	 */
	
	private String tingfangxuzhi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 车位图片
	 */
	
	private String cheweitupian;
				
	
	/**
	 * 设置：区域
	 */
	 
	public void setQuyu(String quyu) {
		this.quyu = quyu;
	}
	
	/**
	 * 获取：区域
	 */
	public String getQuyu() {
		return quyu;
	}
				
	
	/**
	 * 设置：车位状态
	 */
	 
	public void setCheweizhuangtai(String cheweizhuangtai) {
		this.cheweizhuangtai = cheweizhuangtai;
	}
	
	/**
	 * 获取：车位状态
	 */
	public String getCheweizhuangtai() {
		return cheweizhuangtai;
	}
				
	
	/**
	 * 设置：小时计费
	 */
	 
	public void setXiaoshijifei(Integer xiaoshijifei) {
		this.xiaoshijifei = xiaoshijifei;
	}
	
	/**
	 * 获取：小时计费
	 */
	public Integer getXiaoshijifei() {
		return xiaoshijifei;
	}
				
	
	/**
	 * 设置：停放须知
	 */
	 
	public void setTingfangxuzhi(String tingfangxuzhi) {
		this.tingfangxuzhi = tingfangxuzhi;
	}
	
	/**
	 * 获取：停放须知
	 */
	public String getTingfangxuzhi() {
		return tingfangxuzhi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：车位图片
	 */
	 
	public void setCheweitupian(String cheweitupian) {
		this.cheweitupian = cheweitupian;
	}
	
	/**
	 * 获取：车位图片
	 */
	public String getCheweitupian() {
		return cheweitupian;
	}
			
}
