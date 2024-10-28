package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MaijiapingjiaDao;
import com.entity.MaijiapingjiaEntity;
import com.service.MaijiapingjiaService;
import com.entity.vo.MaijiapingjiaVO;
import com.entity.view.MaijiapingjiaView;

@Service("maijiapingjiaService")
public class MaijiapingjiaServiceImpl extends ServiceImpl<MaijiapingjiaDao, MaijiapingjiaEntity> implements MaijiapingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MaijiapingjiaEntity> page = this.selectPage(
                new Query<MaijiapingjiaEntity>(params).getPage(),
                new EntityWrapper<MaijiapingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MaijiapingjiaEntity> wrapper) {
		  Page<MaijiapingjiaView> page =new Query<MaijiapingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MaijiapingjiaVO> selectListVO(Wrapper<MaijiapingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MaijiapingjiaVO selectVO(Wrapper<MaijiapingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MaijiapingjiaView> selectListView(Wrapper<MaijiapingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MaijiapingjiaView selectView(Wrapper<MaijiapingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
