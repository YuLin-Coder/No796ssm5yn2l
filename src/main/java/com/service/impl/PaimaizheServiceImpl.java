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


import com.dao.PaimaizheDao;
import com.entity.PaimaizheEntity;
import com.service.PaimaizheService;
import com.entity.vo.PaimaizheVO;
import com.entity.view.PaimaizheView;

@Service("paimaizheService")
public class PaimaizheServiceImpl extends ServiceImpl<PaimaizheDao, PaimaizheEntity> implements PaimaizheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PaimaizheEntity> page = this.selectPage(
                new Query<PaimaizheEntity>(params).getPage(),
                new EntityWrapper<PaimaizheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PaimaizheEntity> wrapper) {
		  Page<PaimaizheView> page =new Query<PaimaizheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PaimaizheVO> selectListVO(Wrapper<PaimaizheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PaimaizheVO selectVO(Wrapper<PaimaizheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PaimaizheView> selectListView(Wrapper<PaimaizheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PaimaizheView selectView(Wrapper<PaimaizheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
