package com.entity.model;

import com.entity.HuiyuanzhiduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 会员制度
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-22 23:39:14
 */
public class HuiyuanzhiduModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会员类型
	 */
	
	private String huiyuanleixing;
		
	/**
	 * 会员待遇
	 */
	
	private String huiyuandaiyu;
		
	/**
	 * 办理价格
	 */
	
	private Integer banlijiage;
		
	/**
	 * 办理须知
	 */
	
	private String banlixuzhi;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：会员类型
	 */
	 
	public void setHuiyuanleixing(String huiyuanleixing) {
		this.huiyuanleixing = huiyuanleixing;
	}
	
	/**
	 * 获取：会员类型
	 */
	public String getHuiyuanleixing() {
		return huiyuanleixing;
	}
				
	
	/**
	 * 设置：会员待遇
	 */
	 
	public void setHuiyuandaiyu(String huiyuandaiyu) {
		this.huiyuandaiyu = huiyuandaiyu;
	}
	
	/**
	 * 获取：会员待遇
	 */
	public String getHuiyuandaiyu() {
		return huiyuandaiyu;
	}
				
	
	/**
	 * 设置：办理价格
	 */
	 
	public void setBanlijiage(Integer banlijiage) {
		this.banlijiage = banlijiage;
	}
	
	/**
	 * 获取：办理价格
	 */
	public Integer getBanlijiage() {
		return banlijiage;
	}
				
	
	/**
	 * 设置：办理须知
	 */
	 
	public void setBanlixuzhi(String banlixuzhi) {
		this.banlixuzhi = banlixuzhi;
	}
	
	/**
	 * 获取：办理须知
	 */
	public String getBanlixuzhi() {
		return banlixuzhi;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
