package com.chinare.common_data.biz.manangeAccLink.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 管理人账户关联表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
public class MngacclinkDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//管理人账户号码
	private String mngaccno;
	//管理人类型
	private String mngtype;
	//管理人编码
	private String mngcode;
	//管理人名称
	private String mngname;
	//账户分类
	private String accountkind;
	//账户开户行
	private String accbankname;
	//账户账号
	private String accno;
	//账户名称
	private String accname;
	//备注
	private String remark;
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
	//托管人编码
	private String custodiancode;
	//托管人名称
	private String custodianname;
	//管理人收款账户状态
	private String mngaccstatue;
	//CIF编码
	private String collectchangeacc;

	/**
	 * 设置：管理人账户号码
	 */
	public void setMngaccno(String mngaccno) {
		this.mngaccno = mngaccno;
	}
	/**
	 * 获取：管理人账户号码
	 */
	public String getMngaccno() {
		return mngaccno;
	}
	/**
	 * 设置：管理人类型
	 */
	public void setMngtype(String mngtype) {
		this.mngtype = mngtype;
	}
	/**
	 * 获取：管理人类型
	 */
	public String getMngtype() {
		return mngtype;
	}
	/**
	 * 设置：管理人编码
	 */
	public void setMngcode(String mngcode) {
		this.mngcode = mngcode;
	}
	/**
	 * 获取：管理人编码
	 */
	public String getMngcode() {
		return mngcode;
	}
	/**
	 * 设置：管理人名称
	 */
	public void setMngname(String mngname) {
		this.mngname = mngname;
	}
	/**
	 * 获取：管理人名称
	 */
	public String getMngname() {
		return mngname;
	}
	/**
	 * 设置：账户分类
	 */
	public void setAccountkind(String accountkind) {
		this.accountkind = accountkind;
	}
	/**
	 * 获取：账户分类
	 */
	public String getAccountkind() {
		return accountkind;
	}
	/**
	 * 设置：账户开户行
	 */
	public void setAccbankname(String accbankname) {
		this.accbankname = accbankname;
	}
	/**
	 * 获取：账户开户行
	 */
	public String getAccbankname() {
		return accbankname;
	}
	/**
	 * 设置：账户账号
	 */
	public void setAccno(String accno) {
		this.accno = accno;
	}
	/**
	 * 获取：账户账号
	 */
	public String getAccno() {
		return accno;
	}
	/**
	 * 设置：账户名称
	 */
	public void setAccname(String accname) {
		this.accname = accname;
	}
	/**
	 * 获取：账户名称
	 */
	public String getAccname() {
		return accname;
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
	 * 设置：托管人编码
	 */
	public void setCustodiancode(String custodiancode) {
		this.custodiancode = custodiancode;
	}
	/**
	 * 获取：托管人编码
	 */
	public String getCustodiancode() {
		return custodiancode;
	}
	/**
	 * 设置：托管人名称
	 */
	public void setCustodianname(String custodianname) {
		this.custodianname = custodianname;
	}
	/**
	 * 获取：托管人名称
	 */
	public String getCustodianname() {
		return custodianname;
	}
	/**
	 * 设置：管理人收款账户状态
	 */
	public void setMngaccstatue(String mngaccstatue) {
		this.mngaccstatue = mngaccstatue;
	}
	/**
	 * 获取：管理人收款账户状态
	 */
	public String getMngaccstatue() {
		return mngaccstatue;
	}
	/**
	 * 设置：CIF编码
	 */
	public void setCollectchangeacc(String collectchangeacc) {
		this.collectchangeacc = collectchangeacc;
	}
	/**
	 * 获取：CIF编码
	 */
	public String getCollectchangeacc() {
		return collectchangeacc;
	}
}
