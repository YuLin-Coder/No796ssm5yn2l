package com.entity.vo;

import com.entity.JingpaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 竞拍信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-20 12:57:51
 */
public class JingpaixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
