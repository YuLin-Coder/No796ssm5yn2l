package com.dao;

import com.entity.JingpaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingpaixinxiVO;
import com.entity.view.JingpaixinxiView;


/**
 * 竞拍信息
 * 
 * @author 
 * @email 
 * @date 2021-03-20 12:57:51
 */
public interface JingpaixinxiDao extends BaseMapper<JingpaixinxiEntity> {
	
	List<JingpaixinxiVO> selectListVO(@Param("ew") Wrapper<JingpaixinxiEntity> wrapper);
	
	JingpaixinxiVO selectVO(@Param("ew") Wrapper<JingpaixinxiEntity> wrapper);
	
	List<JingpaixinxiView> selectListView(@Param("ew") Wrapper<JingpaixinxiEntity> wrapper);

	List<JingpaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JingpaixinxiEntity> wrapper);
	
	JingpaixinxiView selectView(@Param("ew") Wrapper<JingpaixinxiEntity> wrapper);
	
}
