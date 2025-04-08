package com.dao;

import com.entity.HuiyuanbanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanbanliVO;
import com.entity.view.HuiyuanbanliView;


/**
 * 会员办理
 * 
 * @author 
 * @email 
 * @date 2021-05-22 23:39:14
 */
public interface HuiyuanbanliDao extends BaseMapper<HuiyuanbanliEntity> {
	
	List<HuiyuanbanliVO> selectListVO(@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);
	
	HuiyuanbanliVO selectVO(@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);
	
	List<HuiyuanbanliView> selectListView(@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);

	List<HuiyuanbanliView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);
	
	HuiyuanbanliView selectView(@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);
	
}
