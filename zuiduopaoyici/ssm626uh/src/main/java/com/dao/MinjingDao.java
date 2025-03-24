package com.dao;

import com.entity.MinjingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MinjingVO;
import com.entity.view.MinjingView;


/**
 * 民警
 * 
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
public interface MinjingDao extends BaseMapper<MinjingEntity> {
	
	List<MinjingVO> selectListVO(@Param("ew") Wrapper<MinjingEntity> wrapper);
	
	MinjingVO selectVO(@Param("ew") Wrapper<MinjingEntity> wrapper);
	
	List<MinjingView> selectListView(@Param("ew") Wrapper<MinjingEntity> wrapper);

	List<MinjingView> selectListView(Pagination page,@Param("ew") Wrapper<MinjingEntity> wrapper);
	
	MinjingView selectView(@Param("ew") Wrapper<MinjingEntity> wrapper);
	

}
