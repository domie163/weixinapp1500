package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.AnjianjinzhanDao;
import com.entity.AnjianjinzhanEntity;
import com.service.AnjianjinzhanService;
import com.entity.vo.AnjianjinzhanVO;
import com.entity.view.AnjianjinzhanView;

@Service("anjianjinzhanService")
public class AnjianjinzhanServiceImpl extends ServiceImpl<AnjianjinzhanDao, AnjianjinzhanEntity> implements AnjianjinzhanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AnjianjinzhanEntity> page = this.selectPage(
                new Query<AnjianjinzhanEntity>(params).getPage(),
                new EntityWrapper<AnjianjinzhanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AnjianjinzhanEntity> wrapper) {
		  Page<AnjianjinzhanView> page =new Query<AnjianjinzhanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AnjianjinzhanVO> selectListVO(Wrapper<AnjianjinzhanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AnjianjinzhanVO selectVO(Wrapper<AnjianjinzhanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AnjianjinzhanView> selectListView(Wrapper<AnjianjinzhanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AnjianjinzhanView selectView(Wrapper<AnjianjinzhanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
