package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingpaishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingpaishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingpaishangpinView;


/**
 * 竞拍商品
 *
 * @author 
 * @email 
 * @date 2021-03-20 12:57:51
 */
public interface JingpaishangpinService extends IService<JingpaishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingpaishangpinVO> selectListVO(Wrapper<JingpaishangpinEntity> wrapper);
   	
   	JingpaishangpinVO selectVO(@Param("ew") Wrapper<JingpaishangpinEntity> wrapper);
   	
   	List<JingpaishangpinView> selectListView(Wrapper<JingpaishangpinEntity> wrapper);
   	
   	JingpaishangpinView selectView(@Param("ew") Wrapper<JingpaishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingpaishangpinEntity> wrapper);
   	
}

