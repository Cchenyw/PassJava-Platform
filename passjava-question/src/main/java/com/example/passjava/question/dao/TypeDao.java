package com.example.passjava.question.dao;

import com.example.passjava.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 12:44:18
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
