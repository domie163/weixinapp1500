package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LianxinxiView;


/**
 * 立案信息
 *
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
public interface LianxinxiService extends IService<LianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LianxinxiVO> selectListVO(Wrapper<LianxinxiEntity> wrapper);
   	
   	LianxinxiVO selectVO(@Param("ew") Wrapper<LianxinxiEntity> wrapper);
   	
   	List<LianxinxiView> selectListView(Wrapper<LianxinxiEntity> wrapper);
   	
   	LianxinxiView selectView(@Param("ew") Wrapper<LianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LianxinxiEntity> wrapper);
   	

}

