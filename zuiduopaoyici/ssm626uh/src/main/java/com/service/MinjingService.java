package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MinjingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MinjingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MinjingView;


/**
 * 民警
 *
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
public interface MinjingService extends IService<MinjingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MinjingVO> selectListVO(Wrapper<MinjingEntity> wrapper);
   	
   	MinjingVO selectVO(@Param("ew") Wrapper<MinjingEntity> wrapper);
   	
   	List<MinjingView> selectListView(Wrapper<MinjingEntity> wrapper);
   	
   	MinjingView selectView(@Param("ew") Wrapper<MinjingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MinjingEntity> wrapper);
   	

}

