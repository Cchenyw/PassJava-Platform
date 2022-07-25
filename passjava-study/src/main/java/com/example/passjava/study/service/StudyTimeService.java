package com.example.passjava.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.passjava.study.entity.StudyTimeEntity;

import java.util.Map;

/**
 * 学习-用户学习时常表
 *
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:22:44
 */
public interface StudyTimeService extends IService<StudyTimeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

