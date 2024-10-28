package com.dao;

import com.entity.JingpaijieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingpaijieguoVO;
import com.entity.view.JingpaijieguoView;


/**
 * 竞拍结果
 * 
 * @author 
 * @email 
 * @date 2021-03-20 12:57:51
 */
public interface JingpaijieguoDao extends BaseMapper<JingpaijieguoEntity> {
	
	List<JingpaijieguoVO> selectListVO(@Param("ew") Wrapper<JingpaijieguoEntity> wrapper);
	
	JingpaijieguoVO selectVO(@Param("ew") Wrapper<JingpaijieguoEntity> wrapper);
	
	List<JingpaijieguoView> selectListView(@Param("ew") Wrapper<JingpaijieguoEntity> wrapper);

	List<JingpaijieguoView> selectListView(Pagination page,@Param("ew") Wrapper<JingpaijieguoEntity> wrapper);
	
	JingpaijieguoView selectView(@Param("ew") Wrapper<JingpaijieguoEntity> wrapper);
	
}
