package com.dao;

import com.entity.BaoanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoanxinxiVO;
import com.entity.view.BaoanxinxiView;


/**
 * 报案信息
 * 
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
public interface BaoanxinxiDao extends BaseMapper<BaoanxinxiEntity> {
	
	List<BaoanxinxiVO> selectListVO(@Param("ew") Wrapper<BaoanxinxiEntity> wrapper);
	
	BaoanxinxiVO selectVO(@Param("ew") Wrapper<BaoanxinxiEntity> wrapper);
	
	List<BaoanxinxiView> selectListView(@Param("ew") Wrapper<BaoanxinxiEntity> wrapper);

	List<BaoanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaoanxinxiEntity> wrapper);
	
	BaoanxinxiView selectView(@Param("ew") Wrapper<BaoanxinxiEntity> wrapper);
	

}
