package com.example.passjava.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.passjava.channel.entity.AccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:11:12
 */
public interface AccessTokenService extends IService<AccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

