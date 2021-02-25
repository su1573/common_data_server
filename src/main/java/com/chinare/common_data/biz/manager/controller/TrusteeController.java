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

import com.chinare.common_data.biz.manager.domain.TrusteeDO;
import com.chinare.common_data.biz.manager.service.TrusteeService;
import com.chinare.common_data.common.utils.PageUtils;
import com.chinare.common_data.common.utils.Query;
import com.chinare.common_data.common.utils.R;

/**
 * 受托人信息管理表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
 
@Controller
@RequestMapping("/manager/trustee")
public class TrusteeController {
	@Autowired
	private TrusteeService trusteeService;
	
	@GetMapping()
	@RequiresPermissions("manager:trustee:trustee")
	String Trustee(){
	    return "biz/manager/trustee/trustee";
	}
	
	@ResponseBody
	@PostMapping("/list")
	@RequiresPermissions("manager:trustee:trustee")
	public PageUtils list(@RequestBody Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TrusteeDO> trusteeList = trusteeService.list(query);
		int total = trusteeService.count(query);
		PageUtils pageUtils = new PageUtils(trusteeList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("manager:trustee:add")
	String add(){
	    return "biz/manager/trustee/add";
	}

	@GetMapping("/edit/{trusteecode}")
	@RequiresPermissions("manager:trustee:edit")
	String edit(@PathVariable("trusteecode") String trusteecode,Model model){
		TrusteeDO trustee = trusteeService.get(trusteecode);
		model.addAttribute("trustee", trustee);
	    return "biz/manager/trustee/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("manager:trustee:add")
	public R save( TrusteeDO trustee){
		if(trusteeService.save(trustee)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("manager:trustee:edit")
	public R update(@RequestBody TrusteeDO trustee){
		trusteeService.update(trustee);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("manager:trustee:remove")
	public R remove(@RequestBody Map<String, Object> params){
		if(trusteeService.remove(params)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("manager:trustee:batchRemove")
	public R remove(@RequestParam("ids[]") String[] trusteecodes){
		trusteeService.batchRemove(trusteecodes);
		return R.ok();
	}
	
}
