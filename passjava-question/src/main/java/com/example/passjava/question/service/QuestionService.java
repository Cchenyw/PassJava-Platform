package com.example.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.passjava.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 12:44:18
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

