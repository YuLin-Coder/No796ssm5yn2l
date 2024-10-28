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


import com.dao.JingpaishangpinDao;
import com.entity.JingpaishangpinEntity;
import com.service.JingpaishangpinService;
import com.entity.vo.JingpaishangpinVO;
import com.entity.view.JingpaishangpinView;

@Service("jingpaishangpinService")
public class JingpaishangpinServiceImpl extends ServiceImpl<JingpaishangpinDao, JingpaishangpinEntity> implements JingpaishangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingpaishangpinEntity> page = this.selectPage(
                new Query<JingpaishangpinEntity>(params).getPage(),
                new EntityWrapper<JingpaishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingpaishangpinEntity> wrapper) {
		  Page<JingpaishangpinView> page =new Query<JingpaishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingpaishangpinVO> selectListVO(Wrapper<JingpaishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingpaishangpinVO selectVO(Wrapper<JingpaishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingpaishangpinView> selectListView(Wrapper<JingpaishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingpaishangpinView selectView(Wrapper<JingpaishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
