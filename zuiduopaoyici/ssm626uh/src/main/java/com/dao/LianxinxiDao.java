package com.dao;

import com.entity.LianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LianxinxiVO;
import com.entity.view.LianxinxiView;


/**
 * 立案信息
 * 
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
public interface LianxinxiDao extends BaseMapper<LianxinxiEntity> {
	
	List<LianxinxiVO> selectListVO(@Param("ew") Wrapper<LianxinxiEntity> wrapper);
	
	LianxinxiVO selectVO(@Param("ew") Wrapper<LianxinxiEntity> wrapper);
	
	List<LianxinxiView> selectListView(@Param("ew") Wrapper<LianxinxiEntity> wrapper);

	List<LianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LianxinxiEntity> wrapper);
	
	LianxinxiView selectView(@Param("ew") Wrapper<LianxinxiEntity> wrapper);
	

}
