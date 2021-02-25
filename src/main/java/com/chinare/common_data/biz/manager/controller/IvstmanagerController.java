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

import com.chinare.common_data.biz.manager.domain.IvstmanagerDO;
import com.chinare.common_data.biz.manager.service.IvstmanagerService;
import com.chinare.common_data.common.utils.PageUtils;
import com.chinare.common_data.common.utils.Query;
import com.chinare.common_data.common.utils.R;

/**
 * 投资管理人信息管理表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
 
@Controller
@RequestMapping("/manager/ivstmanager")
public class IvstmanagerController {
	@Autowired
	private IvstmanagerService ivstmanagerService;
	
	@GetMapping()
	@RequiresPermissions("manager:ivstmanager:ivstmanager")
	String Ivstmanager(){
	    return "biz/manager/ivstmanager/ivstmanager";
	}
	
	@ResponseBody
	@PostMapping("/list")
	@RequiresPermissions("manager:ivstmanager:ivstmanager")
	public PageUtils list(@RequestBody Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<IvstmanagerDO> ivstmanagerList = ivstmanagerService.list(query);
		int total = ivstmanagerService.count(query);
		PageUtils pageUtils = new PageUtils(ivstmanagerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("manager:ivstmanager:add")
	String add(){
	    return "biz/manager/ivstmanager/add";
	}

	@GetMapping("/edit/{ivstmngcode}")
	@RequiresPermissions("manager:ivstmanager:edit")
	String edit(@PathVariable("ivstmngcode") String ivstmngcode,Model model){
		IvstmanagerDO ivstmanager = ivstmanagerService.get(ivstmngcode);
		model.addAttribute("ivstmanager", ivstmanager);
	    return "biz/manager/ivstmanager/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("manager:ivstmanager:add")
	public R save( IvstmanagerDO ivstmanager){
		if(ivstmanagerService.save(ivstmanager)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("manager:ivstmanager:edit")
	public R update(@RequestBody IvstmanagerDO ivstmanager){
		ivstmanagerService.update(ivstmanager);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("manager:ivstmanager:remove")
	public R remove(@RequestBody Map<String, Object> params){
		if(ivstmanagerService.remove(params)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("manager:ivstmanager:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ivstmngcodes){
		ivstmanagerService.batchRemove(ivstmngcodes);
		return R.ok();
	}
	
}
