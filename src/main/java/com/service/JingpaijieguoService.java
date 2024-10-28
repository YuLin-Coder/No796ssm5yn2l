package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingpaijieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingpaijieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingpaijieguoView;


/**
 * 竞拍结果
 *
 * @author 
 * @email 
 * @date 2021-03-20 12:57:51
 */
public interface JingpaijieguoService extends IService<JingpaijieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingpaijieguoVO> selectListVO(Wrapper<JingpaijieguoEntity> wrapper);
   	
   	JingpaijieguoVO selectVO(@Param("ew") Wrapper<JingpaijieguoEntity> wrapper);
   	
   	List<JingpaijieguoView> selectListView(Wrapper<JingpaijieguoEntity> wrapper);
   	
   	JingpaijieguoView selectView(@Param("ew") Wrapper<JingpaijieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingpaijieguoEntity> wrapper);
   	
}

