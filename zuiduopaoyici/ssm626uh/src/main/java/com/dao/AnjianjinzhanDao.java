package com.dao;

import com.entity.AnjianjinzhanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AnjianjinzhanVO;
import com.entity.view.AnjianjinzhanView;


/**
 * 案件进展
 * 
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
public interface AnjianjinzhanDao extends BaseMapper<AnjianjinzhanEntity> {
	
	List<AnjianjinzhanVO> selectListVO(@Param("ew") Wrapper<AnjianjinzhanEntity> wrapper);
	
	AnjianjinzhanVO selectVO(@Param("ew") Wrapper<AnjianjinzhanEntity> wrapper);
	
	List<AnjianjinzhanView> selectListView(@Param("ew") Wrapper<AnjianjinzhanEntity> wrapper);

	List<AnjianjinzhanView> selectListView(Pagination page,@Param("ew") Wrapper<AnjianjinzhanEntity> wrapper);
	
	AnjianjinzhanView selectView(@Param("ew") Wrapper<AnjianjinzhanEntity> wrapper);
	

}
