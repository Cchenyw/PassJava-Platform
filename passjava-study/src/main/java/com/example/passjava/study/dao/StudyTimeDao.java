package com.example.passjava.study.dao;

import com.example.passjava.study.entity.StudyTimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:22:44
 */
@Mapper
public interface StudyTimeDao extends BaseMapper<StudyTimeEntity> {
	
}
