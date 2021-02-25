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

import com.chinare.common_data.biz.manager.domain.AccmanagerDO;
import com.chinare.common_data.biz.manager.service.AccmanagerService;
import com.chinare.common_data.common.utils.PageUtils;
import com.chinare.common_data.common.utils.Query;
import com.chinare.common_data.common.utils.R;

/**
 * 帐户管理人信息管理表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
 
@Controller
@RequestMapping("/manager/accmanager")
public class AccmanagerController {
	@Autowired
	private AccmanagerService accmanagerService;
	
	@GetMapping()
	@RequiresPermissions("manager:accmanager:accmanager")
	String Accmanager(){
	    return "biz/manager/accmanager/accmanager";
	}
	
	@ResponseBody
	@PostMapping("/list")
	@RequiresPermissions("manager:accmanager:accmanager")
	public PageUtils list(@RequestBody Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AccmanagerDO> accmanagerList = accmanagerService.list(query);
		int total = accmanagerService.count(query);
		PageUtils pageUtils = new PageUtils(accmanagerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("manager:accmanager:add")
	String add(){
	    return "biz/manager/accmanager/add";
	}

	@GetMapping("/edit/{accmngcode}")
	@RequiresPermissions("manager:accmanager:edit")
	String edit(@PathVariable("accmngcode") String accmngcode,Model model){
		AccmanagerDO accmanager = accmanagerService.get(accmngcode);
		model.addAttribute("accmanager", accmanager);
	    return "biz/manager/accmanager/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("manager:accmanager:add")
	public R save( AccmanagerDO accmanager){
		if(accmanagerService.save(accmanager)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("manager:accmanager:edit")
	public R update(@RequestBody AccmanagerDO accmanager){
		accmanagerService.update(accmanager);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("manager:accmanager:remove")
	public R remove(@RequestBody Map<String, Object> params){
		if(accmanagerService.remove(params)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("manager:accmanager:batchRemove")
	public R remove(@RequestParam("ids[]") String[] accmngcodes){
		accmanagerService.batchRemove(accmngcodes);
		return R.ok();
	}
	
}
