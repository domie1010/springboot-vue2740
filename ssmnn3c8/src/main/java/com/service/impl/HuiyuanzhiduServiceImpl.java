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


import com.dao.HuiyuanzhiduDao;
import com.entity.HuiyuanzhiduEntity;
import com.service.HuiyuanzhiduService;
import com.entity.vo.HuiyuanzhiduVO;
import com.entity.view.HuiyuanzhiduView;

@Service("huiyuanzhiduService")
public class HuiyuanzhiduServiceImpl extends ServiceImpl<HuiyuanzhiduDao, HuiyuanzhiduEntity> implements HuiyuanzhiduService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanzhiduEntity> page = this.selectPage(
                new Query<HuiyuanzhiduEntity>(params).getPage(),
                new EntityWrapper<HuiyuanzhiduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanzhiduEntity> wrapper) {
		  Page<HuiyuanzhiduView> page =new Query<HuiyuanzhiduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanzhiduVO> selectListVO(Wrapper<HuiyuanzhiduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanzhiduVO selectVO(Wrapper<HuiyuanzhiduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanzhiduView> selectListView(Wrapper<HuiyuanzhiduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanzhiduView selectView(Wrapper<HuiyuanzhiduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
