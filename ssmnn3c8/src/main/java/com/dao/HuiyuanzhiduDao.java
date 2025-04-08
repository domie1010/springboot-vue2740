package com.dao;

import com.entity.HuiyuanzhiduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanzhiduVO;
import com.entity.view.HuiyuanzhiduView;


/**
 * 会员制度
 * 
 * @author 
 * @email 
 * @date 2021-05-22 23:39:14
 */
public interface HuiyuanzhiduDao extends BaseMapper<HuiyuanzhiduEntity> {
	
	List<HuiyuanzhiduVO> selectListVO(@Param("ew") Wrapper<HuiyuanzhiduEntity> wrapper);
	
	HuiyuanzhiduVO selectVO(@Param("ew") Wrapper<HuiyuanzhiduEntity> wrapper);
	
	List<HuiyuanzhiduView> selectListView(@Param("ew") Wrapper<HuiyuanzhiduEntity> wrapper);

	List<HuiyuanzhiduView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanzhiduEntity> wrapper);
	
	HuiyuanzhiduView selectView(@Param("ew") Wrapper<HuiyuanzhiduEntity> wrapper);
	
}
