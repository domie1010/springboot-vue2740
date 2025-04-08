package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanbanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanbanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanbanliView;


/**
 * 会员办理
 *
 * @author 
 * @email 
 * @date 2021-05-22 23:39:14
 */
public interface HuiyuanbanliService extends IService<HuiyuanbanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanbanliVO> selectListVO(Wrapper<HuiyuanbanliEntity> wrapper);
   	
   	HuiyuanbanliVO selectVO(@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);
   	
   	List<HuiyuanbanliView> selectListView(Wrapper<HuiyuanbanliEntity> wrapper);
   	
   	HuiyuanbanliView selectView(@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanbanliEntity> wrapper);
   	
}

