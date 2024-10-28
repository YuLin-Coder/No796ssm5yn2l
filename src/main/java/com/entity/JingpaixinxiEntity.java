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
 * 竞拍信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-20 12:57:51
 */
@TableName("jingpaixinxi")
public class JingpaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingpaixinxiEntity() {
		
	}
	
	public JingpaixinxiEntity(T t) {
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
	 * 竞拍编号
	 */
					
	private String jingpaibianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 拍卖账号
	 */
					
	private String paimaizhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 数量
	 */
					
	private String shuliang;
	
	/**
	 * 起拍价
	 */
					
	private String qipaijia;
	
	/**
	 * 竞拍价格
	 */
					
	private String jingpaijiage;
	
	/**
	 * 竞拍日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jingpairiqi;
	
	/**
	 * 买家账号
	 */
					
	private String maijiazhanghao;
	
	/**
	 * 买家姓名
	 */
					
	private String maijiaxingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	
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
	 * 设置：竞拍编号
	 */
	public void setJingpaibianhao(String jingpaibianhao) {
		this.jingpaibianhao = jingpaibianhao;
	}
	/**
	 * 获取：竞拍编号
	 */
	public String getJingpaibianhao() {
		return jingpaibianhao;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：拍卖账号
	 */
	public void setPaimaizhanghao(String paimaizhanghao) {
		this.paimaizhanghao = paimaizhanghao;
	}
	/**
	 * 获取：拍卖账号
	 */
	public String getPaimaizhanghao() {
		return paimaizhanghao;
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
	 * 设置：数量
	 */
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：起拍价
	 */
	public void setQipaijia(String qipaijia) {
		this.qipaijia = qipaijia;
	}
	/**
	 * 获取：起拍价
	 */
	public String getQipaijia() {
		return qipaijia;
	}
	/**
	 * 设置：竞拍价格
	 */
	public void setJingpaijiage(String jingpaijiage) {
		this.jingpaijiage = jingpaijiage;
	}
	/**
	 * 获取：竞拍价格
	 */
	public String getJingpaijiage() {
		return jingpaijiage;
	}
	/**
	 * 设置：竞拍日期
	 */
	public void setJingpairiqi(Date jingpairiqi) {
		this.jingpairiqi = jingpairiqi;
	}
	/**
	 * 获取：竞拍日期
	 */
	public Date getJingpairiqi() {
		return jingpairiqi;
	}
	/**
	 * 设置：买家账号
	 */
	public void setMaijiazhanghao(String maijiazhanghao) {
		this.maijiazhanghao = maijiazhanghao;
	}
	/**
	 * 获取：买家账号
	 */
	public String getMaijiazhanghao() {
		return maijiazhanghao;
	}
	/**
	 * 设置：买家姓名
	 */
	public void setMaijiaxingming(String maijiaxingming) {
		this.maijiaxingming = maijiaxingming;
	}
	/**
	 * 获取：买家姓名
	 */
	public String getMaijiaxingming() {
		return maijiaxingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}

}
