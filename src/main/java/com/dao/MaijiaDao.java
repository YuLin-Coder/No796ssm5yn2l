package com.dao;

import com.entity.MaijiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MaijiaVO;
import com.entity.view.MaijiaView;


/**
 * 买家
 * 
 * @author 
 * @email 
 * @date 2021-03-20 12:57:50
 */
public interface MaijiaDao extends BaseMapper<MaijiaEntity> {
	
	List<MaijiaVO> selectListVO(@Param("ew") Wrapper<MaijiaEntity> wrapper);
	
	MaijiaVO selectVO(@Param("ew") Wrapper<MaijiaEntity> wrapper);
	
	List<MaijiaView> selectListView(@Param("ew") Wrapper<MaijiaEntity> wrapper);

	List<MaijiaView> selectListView(Pagination page,@Param("ew") Wrapper<MaijiaEntity> wrapper);
	
	MaijiaView selectView(@Param("ew") Wrapper<MaijiaEntity> wrapper);
	
}
