package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanzhiduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanzhiduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanzhiduView;


/**
 * 会员制度
 *
 * @author 
 * @email 
 * @date 2021-05-22 23:39:14
 */
public interface HuiyuanzhiduService extends IService<HuiyuanzhiduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanzhiduVO> selectListVO(Wrapper<HuiyuanzhiduEntity> wrapper);
   	
   	HuiyuanzhiduVO selectVO(@Param("ew") Wrapper<HuiyuanzhiduEntity> wrapper);
   	
   	List<HuiyuanzhiduView> selectListView(Wrapper<HuiyuanzhiduEntity> wrapper);
   	
   	HuiyuanzhiduView selectView(@Param("ew") Wrapper<HuiyuanzhiduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanzhiduEntity> wrapper);
   	
}

