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


import com.dao.LianxinxiDao;
import com.entity.LianxinxiEntity;
import com.service.LianxinxiService;
import com.entity.vo.LianxinxiVO;
import com.entity.view.LianxinxiView;

@Service("lianxinxiService")
public class LianxinxiServiceImpl extends ServiceImpl<LianxinxiDao, LianxinxiEntity> implements LianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LianxinxiEntity> page = this.selectPage(
                new Query<LianxinxiEntity>(params).getPage(),
                new EntityWrapper<LianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LianxinxiEntity> wrapper) {
		  Page<LianxinxiView> page =new Query<LianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LianxinxiVO> selectListVO(Wrapper<LianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LianxinxiVO selectVO(Wrapper<LianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LianxinxiView> selectListView(Wrapper<LianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LianxinxiView selectView(Wrapper<LianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
