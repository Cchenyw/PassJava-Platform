package com.example.passjava.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.passjava.content.entity.BannerEntity;

import java.util.Map;

/**
 * 内容-横幅广告表
 *
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:15:54
 */
public interface BannerService extends IService<BannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

