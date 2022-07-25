package com.example.passjava.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.passjava.channel.entity.ChannelEntity;

import java.util.Map;

/**
 * 渠道-渠道表
 *
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:11:12
 */
public interface ChannelService extends IService<ChannelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

