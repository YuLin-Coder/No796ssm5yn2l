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


import com.dao.JingpaijieguoDao;
import com.entity.JingpaijieguoEntity;
import com.service.JingpaijieguoService;
import com.entity.vo.JingpaijieguoVO;
import com.entity.view.JingpaijieguoView;

@Service("jingpaijieguoService")
public class JingpaijieguoServiceImpl extends ServiceImpl<JingpaijieguoDao, JingpaijieguoEntity> implements JingpaijieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingpaijieguoEntity> page = this.selectPage(
                new Query<JingpaijieguoEntity>(params).getPage(),
                new EntityWrapper<JingpaijieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingpaijieguoEntity> wrapper) {
		  Page<JingpaijieguoView> page =new Query<JingpaijieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingpaijieguoVO> selectListVO(Wrapper<JingpaijieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingpaijieguoVO selectVO(Wrapper<JingpaijieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingpaijieguoView> selectListView(Wrapper<JingpaijieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingpaijieguoView selectView(Wrapper<JingpaijieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
