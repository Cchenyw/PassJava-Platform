package com.example.passjava.study.dao;

import com.example.passjava.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:22:44
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
