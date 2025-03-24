package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LianxinxiEntity;
import com.entity.view.LianxinxiView;

import com.service.LianxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 立案信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
@RestController
@RequestMapping("/lianxinxi")
public class LianxinxiController {
    @Autowired
    private LianxinxiService lianxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LianxinxiEntity lianxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			lianxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("minjing")) {
			lianxinxi.setJinghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LianxinxiEntity> ew = new EntityWrapper<LianxinxiEntity>();
		PageUtils page = lianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lianxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LianxinxiEntity lianxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			lianxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("minjing")) {
			lianxinxi.setJinghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LianxinxiEntity> ew = new EntityWrapper<LianxinxiEntity>();
		PageUtils page = lianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lianxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LianxinxiEntity lianxinxi){
       	EntityWrapper<LianxinxiEntity> ew = new EntityWrapper<LianxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lianxinxi, "lianxinxi")); 
        return R.ok().put("data", lianxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LianxinxiEntity lianxinxi){
        EntityWrapper< LianxinxiEntity> ew = new EntityWrapper< LianxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lianxinxi, "lianxinxi")); 
		LianxinxiView lianxinxiView =  lianxinxiService.selectView(ew);
		return R.ok("查询立案信息成功").put("data", lianxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LianxinxiEntity lianxinxi = lianxinxiService.selectById(id);
        return R.ok().put("data", lianxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LianxinxiEntity lianxinxi = lianxinxiService.selectById(id);
        return R.ok().put("data", lianxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LianxinxiEntity lianxinxi, HttpServletRequest request){
    	lianxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lianxinxi);

        lianxinxiService.insert(lianxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LianxinxiEntity lianxinxi, HttpServletRequest request){
    	lianxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lianxinxi);
    	lianxinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        lianxinxiService.insert(lianxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LianxinxiEntity lianxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lianxinxi);
        lianxinxiService.updateById(lianxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lianxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<LianxinxiEntity> wrapper = new EntityWrapper<LianxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("minjing")) {
			wrapper.eq("jinghao", (String)request.getSession().getAttribute("username"));
		}

		int count = lianxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
