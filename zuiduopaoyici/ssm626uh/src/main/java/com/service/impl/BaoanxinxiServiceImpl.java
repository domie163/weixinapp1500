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


import com.dao.BaoanxinxiDao;
import com.entity.BaoanxinxiEntity;
import com.service.BaoanxinxiService;
import com.entity.vo.BaoanxinxiVO;
import com.entity.view.BaoanxinxiView;

@Service("baoanxinxiService")
public class BaoanxinxiServiceImpl extends ServiceImpl<BaoanxinxiDao, BaoanxinxiEntity> implements BaoanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoanxinxiEntity> page = this.selectPage(
                new Query<BaoanxinxiEntity>(params).getPage(),
                new EntityWrapper<BaoanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoanxinxiEntity> wrapper) {
		  Page<BaoanxinxiView> page =new Query<BaoanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoanxinxiVO> selectListVO(Wrapper<BaoanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoanxinxiVO selectVO(Wrapper<BaoanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoanxinxiView> selectListView(Wrapper<BaoanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoanxinxiView selectView(Wrapper<BaoanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
