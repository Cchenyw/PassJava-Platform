package com.example.passjava.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.passjava.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:15:54
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

