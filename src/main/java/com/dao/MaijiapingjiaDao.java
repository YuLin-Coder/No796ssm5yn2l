package com.dao;

import com.entity.MaijiapingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MaijiapingjiaVO;
import com.entity.view.MaijiapingjiaView;


/**
 * 买家评价
 * 
 * @author 
 * @email 
 * @date 2021-03-20 12:57:51
 */
public interface MaijiapingjiaDao extends BaseMapper<MaijiapingjiaEntity> {
	
	List<MaijiapingjiaVO> selectListVO(@Param("ew") Wrapper<MaijiapingjiaEntity> wrapper);
	
	MaijiapingjiaVO selectVO(@Param("ew") Wrapper<MaijiapingjiaEntity> wrapper);
	
	List<MaijiapingjiaView> selectListView(@Param("ew") Wrapper<MaijiapingjiaEntity> wrapper);

	List<MaijiapingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<MaijiapingjiaEntity> wrapper);
	
	MaijiapingjiaView selectView(@Param("ew") Wrapper<MaijiapingjiaEntity> wrapper);
	
}
