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


import com.dao.MinjingDao;
import com.entity.MinjingEntity;
import com.service.MinjingService;
import com.entity.vo.MinjingVO;
import com.entity.view.MinjingView;

@Service("minjingService")
public class MinjingServiceImpl extends ServiceImpl<MinjingDao, MinjingEntity> implements MinjingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MinjingEntity> page = this.selectPage(
                new Query<MinjingEntity>(params).getPage(),
                new EntityWrapper<MinjingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MinjingEntity> wrapper) {
		  Page<MinjingView> page =new Query<MinjingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MinjingVO> selectListVO(Wrapper<MinjingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MinjingVO selectVO(Wrapper<MinjingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MinjingView> selectListView(Wrapper<MinjingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MinjingView selectView(Wrapper<MinjingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
