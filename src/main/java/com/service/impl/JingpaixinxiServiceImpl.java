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


import com.dao.JingpaixinxiDao;
import com.entity.JingpaixinxiEntity;
import com.service.JingpaixinxiService;
import com.entity.vo.JingpaixinxiVO;
import com.entity.view.JingpaixinxiView;

@Service("jingpaixinxiService")
public class JingpaixinxiServiceImpl extends ServiceImpl<JingpaixinxiDao, JingpaixinxiEntity> implements JingpaixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingpaixinxiEntity> page = this.selectPage(
                new Query<JingpaixinxiEntity>(params).getPage(),
                new EntityWrapper<JingpaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingpaixinxiEntity> wrapper) {
		  Page<JingpaixinxiView> page =new Query<JingpaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingpaixinxiVO> selectListVO(Wrapper<JingpaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingpaixinxiVO selectVO(Wrapper<JingpaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingpaixinxiView> selectListView(Wrapper<JingpaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingpaixinxiView selectView(Wrapper<JingpaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
