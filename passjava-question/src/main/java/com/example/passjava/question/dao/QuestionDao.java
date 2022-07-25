package com.example.passjava.question.dao;

import com.example.passjava.question.entity.QuestionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 12:44:18
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {
	
}
