package com.chinare.common_data.biz.manager.domain;

import java.io.Serializable;
import java.util.Date;

import java.math.BigDecimal;


/**
 * 受托人信息管理表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
public class TrusteeDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//受托人编码
	private String trusteecode;
	//受托人名称
	private String trusteename;
	//受托人简称
	private String shortname;
	//受托人资格证书编号
	private String certificateno;
	//法定代表人
	private String corporation;
	//注册资本
	private BigDecimal rgtmoney;
	//注册地址
	private String rgtaddress;
	//工商注册号
	private String aicregistration;
	//企业类型
	private String grpnature;
	//单位类别
	private String grptype;
	//资格证书有效起期
	private Date validstartdate;
	//资格证书过期日期
	private Date validexpdate;
	//公司地址
	private String grpaddress;
	//公司邮编
	private String zipcode;
	//公司电话
	private String phone;
	//公司网址
	private String grpurl;
	//上级管理人编码
	private String upmngcode;
	//管理人总部编码
	private String topmngcode;
	//是否有子节点
	private String childflag;
	//币种
	private String currency;
	//备注
	private String remark;
	//受托人状态
	private String status;
	//归属机构
	private String managecom;
	//操作机构
	private String operatecom;
	//操作员
	private String operator;
	//入机日期
	private Date makedate;
	//入机时间
	private String maketime;
	//最后一次操作员
	private String modifyoperator;
	//最后一次修改日期
	private Date modifydate;
	//最后一次修改时间
	private String modifytime;
	//CIF编码
	private String cifid;
	//受托人编号
	private String trusteeid;

	/**
	 * 设置：受托人编码
	 */
	public void setTrusteecode(String trusteecode) {
		this.trusteecode = trusteecode;
	}
	/**
	 * 获取：受托人编码
	 */
	public String getTrusteecode() {
		return trusteecode;
	}
	/**
	 * 设置：受托人名称
	 */
	public void setTrusteename(String trusteename) {
		this.trusteename = trusteename;
	}
	/**
	 * 获取：受托人名称
	 */
	public String getTrusteename() {
		return trusteename;
	}
	/**
	 * 设置：受托人简称
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	/**
	 * 获取：受托人简称
	 */
	public String getShortname() {
		return shortname;
	}
	/**
	 * 设置：受托人资格证书编号
	 */
	public void setCertificateno(String certificateno) {
		this.certificateno = certificateno;
	}
	/**
	 * 获取：受托人资格证书编号
	 */
	public String getCertificateno() {
		return certificateno;
	}
	/**
	 * 设置：法定代表人
	 */
	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}
	/**
	 * 获取：法定代表人
	 */
	public String getCorporation() {
		return corporation;
	}
	/**
	 * 设置：注册资本
	 */
	public void setRgtmoney(BigDecimal rgtmoney) {
		this.rgtmoney = rgtmoney;
	}
	/**
	 * 获取：注册资本
	 */
	public BigDecimal getRgtmoney() {
		return rgtmoney;
	}
	/**
	 * 设置：注册地址
	 */
	public void setRgtaddress(String rgtaddress) {
		this.rgtaddress = rgtaddress;
	}
	/**
	 * 获取：注册地址
	 */
	public String getRgtaddress() {
		return rgtaddress;
	}
	/**
	 * 设置：工商注册号
	 */
	public void setAicregistration(String aicregistration) {
		this.aicregistration = aicregistration;
	}
	/**
	 * 获取：工商注册号
	 */
	public String getAicregistration() {
		return aicregistration;
	}
	/**
	 * 设置：企业类型
	 */
	public void setGrpnature(String grpnature) {
		this.grpnature = grpnature;
	}
	/**
	 * 获取：企业类型
	 */
	public String getGrpnature() {
		return grpnature;
	}
	/**
	 * 设置：单位类别
	 */
	public void setGrptype(String grptype) {
		this.grptype = grptype;
	}
	/**
	 * 获取：单位类别
	 */
	public String getGrptype() {
		return grptype;
	}
	/**
	 * 设置：资格证书有效起期
	 */
	public void setValidstartdate(Date validstartdate) {
		this.validstartdate = validstartdate;
	}
	/**
	 * 获取：资格证书有效起期
	 */
	public Date getValidstartdate() {
		return validstartdate;
	}
	/**
	 * 设置：资格证书过期日期
	 */
	public void setValidexpdate(Date validexpdate) {
		this.validexpdate = validexpdate;
	}
	/**
	 * 获取：资格证书过期日期
	 */
	public Date getValidexpdate() {
		return validexpdate;
	}
	/**
	 * 设置：公司地址
	 */
	public void setGrpaddress(String grpaddress) {
		this.grpaddress = grpaddress;
	}
	/**
	 * 获取：公司地址
	 */
	public String getGrpaddress() {
		return grpaddress;
	}
	/**
	 * 设置：公司邮编
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * 获取：公司邮编
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * 设置：公司电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：公司电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：公司网址
	 */
	public void setGrpurl(String grpurl) {
		this.grpurl = grpurl;
	}
	/**
	 * 获取：公司网址
	 */
	public String getGrpurl() {
		return grpurl;
	}
	/**
	 * 设置：上级管理人编码
	 */
	public void setUpmngcode(String upmngcode) {
		this.upmngcode = upmngcode;
	}
	/**
	 * 获取：上级管理人编码
	 */
	public String getUpmngcode() {
		return upmngcode;
	}
	/**
	 * 设置：管理人总部编码
	 */
	public void setTopmngcode(String topmngcode) {
		this.topmngcode = topmngcode;
	}
	/**
	 * 获取：管理人总部编码
	 */
	public String getTopmngcode() {
		return topmngcode;
	}
	/**
	 * 设置：是否有子节点
	 */
	public void setChildflag(String childflag) {
		this.childflag = childflag;
	}
	/**
	 * 获取：是否有子节点
	 */
	public String getChildflag() {
		return childflag;
	}
	/**
	 * 设置：币种
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * 获取：币种
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：受托人状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：受托人状态
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：归属机构
	 */
	public void setManagecom(String managecom) {
		this.managecom = managecom;
	}
	/**
	 * 获取：归属机构
	 */
	public String getManagecom() {
		return managecom;
	}
	/**
	 * 设置：操作机构
	 */
	public void setOperatecom(String operatecom) {
		this.operatecom = operatecom;
	}
	/**
	 * 获取：操作机构
	 */
	public String getOperatecom() {
		return operatecom;
	}
	/**
	 * 设置：操作员
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}
	/**
	 * 获取：操作员
	 */
	public String getOperator() {
		return operator;
	}
	/**
	 * 设置：入机日期
	 */
	public void setMakedate(Date makedate) {
		this.makedate = makedate;
	}
	/**
	 * 获取：入机日期
	 */
	public Date getMakedate() {
		return makedate;
	}
	/**
	 * 设置：入机时间
	 */
	public void setMaketime(String maketime) {
		this.maketime = maketime;
	}
	/**
	 * 获取：入机时间
	 */
	public String getMaketime() {
		return maketime;
	}
	/**
	 * 设置：最后一次操作员
	 */
	public void setModifyoperator(String modifyoperator) {
		this.modifyoperator = modifyoperator;
	}
	/**
	 * 获取：最后一次操作员
	 */
	public String getModifyoperator() {
		return modifyoperator;
	}
	/**
	 * 设置：最后一次修改日期
	 */
	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}
	/**
	 * 获取：最后一次修改日期
	 */
	public Date getModifydate() {
		return modifydate;
	}
	/**
	 * 设置：最后一次修改时间
	 */
	public void setModifytime(String modifytime) {
		this.modifytime = modifytime;
	}
	/**
	 * 获取：最后一次修改时间
	 */
	public String getModifytime() {
		return modifytime;
	}
	/**
	 * 设置：CIF编码
	 */
	public void setCifid(String cifid) {
		this.cifid = cifid;
	}
	/**
	 * 获取：CIF编码
	 */
	public String getCifid() {
		return cifid;
	}
	/**
	 * 设置：受托人编号
	 */
	public void setTrusteeid(String trusteeid) {
		this.trusteeid = trusteeid;
	}
	/**
	 * 获取：受托人编号
	 */
	public String getTrusteeid() {
		return trusteeid;
	}
}
