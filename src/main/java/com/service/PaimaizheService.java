package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaimaizheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaimaizheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaimaizheView;


/**
 * 拍卖者
 *
 * @author 
 * @email 
 * @date 2021-03-20 12:57:51
 */
public interface PaimaizheService extends IService<PaimaizheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaimaizheVO> selectListVO(Wrapper<PaimaizheEntity> wrapper);
   	
   	PaimaizheVO selectVO(@Param("ew") Wrapper<PaimaizheEntity> wrapper);
   	
   	List<PaimaizheView> selectListView(Wrapper<PaimaizheEntity> wrapper);
   	
   	PaimaizheView selectView(@Param("ew") Wrapper<PaimaizheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaimaizheEntity> wrapper);
   	
}

