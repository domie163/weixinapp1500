package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AnjianjinzhanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AnjianjinzhanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AnjianjinzhanView;


/**
 * 案件进展
 *
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
public interface AnjianjinzhanService extends IService<AnjianjinzhanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AnjianjinzhanVO> selectListVO(Wrapper<AnjianjinzhanEntity> wrapper);
   	
   	AnjianjinzhanVO selectVO(@Param("ew") Wrapper<AnjianjinzhanEntity> wrapper);
   	
   	List<AnjianjinzhanView> selectListView(Wrapper<AnjianjinzhanEntity> wrapper);
   	
   	AnjianjinzhanView selectView(@Param("ew") Wrapper<AnjianjinzhanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AnjianjinzhanEntity> wrapper);
   	

}

