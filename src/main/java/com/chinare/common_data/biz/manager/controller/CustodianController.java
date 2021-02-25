package com.chinare.common_data.biz.manager.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinare.common_data.biz.manager.domain.CustodianDO;
import com.chinare.common_data.biz.manager.service.CustodianService;
import com.chinare.common_data.common.utils.PageUtils;
import com.chinare.common_data.common.utils.Query;
import com.chinare.common_data.common.utils.R;

/**
 * 托管人信息管理表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
 
@Controller
@RequestMapping("/manager/custodian")
public class CustodianController {
	@Autowired
	private CustodianService custodianService;
	
	@GetMapping()
	@RequiresPermissions("manager:custodian:custodian")
	String Custodian(){
	    return "biz/manager/custodian/custodian";
	}
	
	@ResponseBody
	@PostMapping("/list")
	@RequiresPermissions("manager:custodian:custodian")
	public PageUtils list(@RequestBody Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CustodianDO> custodianList = custodianService.list(query);
		int total = custodianService.count(query);
		PageUtils pageUtils = new PageUtils(custodianList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("manager:custodian:add")
	String add(){
	    return "biz/manager/custodian/add";
	}

	@GetMapping("/edit/{custodiancode}")
	@RequiresPermissions("manager:custodian:edit")
	String edit(@PathVariable("custodiancode") String custodiancode,Model model){
		CustodianDO custodian = custodianService.get(custodiancode);
		model.addAttribute("custodian", custodian);
	    return "biz/manager/custodian/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("manager:custodian:add")
	public R save( CustodianDO custodian){
		if(custodianService.save(custodian)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("manager:custodian:edit")
	public R update(@RequestBody CustodianDO custodian){
		custodianService.update(custodian);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("manager:custodian:remove")
	public R remove(@RequestBody Map<String, Object> params){
		if(custodianService.remove(params)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("manager:custodian:batchRemove")
	public R remove(@RequestParam("ids[]") String[] custodiancodes){
		custodianService.batchRemove(custodiancodes);
		return R.ok();
	}
	
}
