package com.chinare.common_data.biz.manangeAccLink.controller;

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

import com.chinare.common_data.biz.manangeAccLink.domain.MngacclinkDO;
import com.chinare.common_data.biz.manangeAccLink.service.MngacclinkService;
import com.chinare.common_data.common.utils.PageUtils;
import com.chinare.common_data.common.utils.Query;
import com.chinare.common_data.common.utils.R;

/**
 * 管理人账户关联表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
 
@Controller
@RequestMapping("/manangeAccLink/mngacclink")
public class MngacclinkController {
	@Autowired
	private MngacclinkService mngacclinkService;
	
	@GetMapping()
	@RequiresPermissions("manangeAccLink:mngacclink:mngacclink")
	String Mngacclink(){
	    return "biz/manangeAccLink/mngacclink/mngacclink";
	}
	
	@ResponseBody
	@PostMapping("/list")
	@RequiresPermissions("manangeAccLink:mngacclink:mngacclink")
	public PageUtils list(@RequestBody Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MngacclinkDO> mngacclinkList = mngacclinkService.list(query);
		int total = mngacclinkService.count(query);
		PageUtils pageUtils = new PageUtils(mngacclinkList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("manangeAccLink:mngacclink:add")
	String add(){
	    return "biz/manangeAccLink/mngacclink/add";
	}

	@GetMapping("/edit/{mngaccno}")
	@RequiresPermissions("manangeAccLink:mngacclink:edit")
	String edit(@PathVariable("mngaccno") String mngaccno,Model model){
		MngacclinkDO mngacclink = mngacclinkService.get(mngaccno);
		model.addAttribute("mngacclink", mngacclink);
	    return "biz/manangeAccLink/mngacclink/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("manangeAccLink:mngacclink:add")
	public R save( MngacclinkDO mngacclink){
		if(mngacclinkService.save(mngacclink)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("manangeAccLink:mngacclink:edit")
	public R update(@RequestBody MngacclinkDO mngacclink){
		mngacclinkService.update(mngacclink);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("manangeAccLink:mngacclink:remove")
	public R remove(@RequestBody Map<String, Object> params){
		if(mngacclinkService.remove(params)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("manangeAccLink:mngacclink:batchRemove")
	public R remove(@RequestParam("ids[]") String[] mngaccnos){
		mngacclinkService.batchRemove(mngaccnos);
		return R.ok();
	}
	
}
