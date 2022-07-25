package com.example.passjava.channel.dao;

import com.example.passjava.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:11:12
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
