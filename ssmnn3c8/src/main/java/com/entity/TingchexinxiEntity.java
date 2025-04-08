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
 * 停车信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-22 23:39:14
 */
@TableName("tingchexinxi")
public class TingchexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TingchexinxiEntity() {
		
	}
	
	public TingchexinxiEntity(T t) {
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
	 * 车位编号
	 */
					
	private String cheweibianhao;
	
	/**
	 * 区域
	 */
					
	private String quyu;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 车辆品牌
	 */
					
	private String cheliangpinpai;
	
	/**
	 * 是否会员
	 */
					
	private String shifouhuiyuan;
	
	/**
	 * 入场时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date ruchangshijian;
	
	/**
	 * 小时计费
	 */
					
	private Integer xiaoshijifei;
	
	/**
	 * 停放时长
	 */
					
	private Integer tingfangshizhang;
	
	/**
	 * 总价
	 */
					
	private String zongjia;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：车位编号
	 */
	public void setCheweibianhao(String cheweibianhao) {
		this.cheweibianhao = cheweibianhao;
	}
	/**
	 * 获取：车位编号
	 */
	public String getCheweibianhao() {
		return cheweibianhao;
	}
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
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
	/**
	 * 设置：车辆品牌
	 */
	public void setCheliangpinpai(String cheliangpinpai) {
		this.cheliangpinpai = cheliangpinpai;
	}
	/**
	 * 获取：车辆品牌
	 */
	public String getCheliangpinpai() {
		return cheliangpinpai;
	}
	/**
	 * 设置：是否会员
	 */
	public void setShifouhuiyuan(String shifouhuiyuan) {
		this.shifouhuiyuan = shifouhuiyuan;
	}
	/**
	 * 获取：是否会员
	 */
	public String getShifouhuiyuan() {
		return shifouhuiyuan;
	}
	/**
	 * 设置：入场时间
	 */
	public void setRuchangshijian(Date ruchangshijian) {
		this.ruchangshijian = ruchangshijian;
	}
	/**
	 * 获取：入场时间
	 */
	public Date getRuchangshijian() {
		return ruchangshijian;
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
	 * 设置：停放时长
	 */
	public void setTingfangshizhang(Integer tingfangshizhang) {
		this.tingfangshizhang = tingfangshizhang;
	}
	/**
	 * 获取：停放时长
	 */
	public Integer getTingfangshizhang() {
		return tingfangshizhang;
	}
	/**
	 * 设置：总价
	 */
	public void setZongjia(String zongjia) {
		this.zongjia = zongjia;
	}
	/**
	 * 获取：总价
	 */
	public String getZongjia() {
		return zongjia;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
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
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
