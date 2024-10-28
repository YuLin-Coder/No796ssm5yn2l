package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingpaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingpaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingpaixinxiView;


/**
 * 竞拍信息
 *
 * @author 
 * @email 
 * @date 2021-03-20 12:57:51
 */
public interface JingpaixinxiService extends IService<JingpaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingpaixinxiVO> selectListVO(Wrapper<JingpaixinxiEntity> wrapper);
   	
   	JingpaixinxiVO selectVO(@Param("ew") Wrapper<JingpaixinxiEntity> wrapper);
   	
   	List<JingpaixinxiView> selectListView(Wrapper<JingpaixinxiEntity> wrapper);
   	
   	JingpaixinxiView selectView(@Param("ew") Wrapper<JingpaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingpaixinxiEntity> wrapper);
   	
}

