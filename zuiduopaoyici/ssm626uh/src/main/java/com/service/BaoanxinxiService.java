package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoanxinxiView;


/**
 * 报案信息
 *
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
public interface BaoanxinxiService extends IService<BaoanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoanxinxiVO> selectListVO(Wrapper<BaoanxinxiEntity> wrapper);
   	
   	BaoanxinxiVO selectVO(@Param("ew") Wrapper<BaoanxinxiEntity> wrapper);
   	
   	List<BaoanxinxiView> selectListView(Wrapper<BaoanxinxiEntity> wrapper);
   	
   	BaoanxinxiView selectView(@Param("ew") Wrapper<BaoanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoanxinxiEntity> wrapper);
   	

}

