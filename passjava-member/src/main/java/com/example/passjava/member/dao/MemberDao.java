package com.example.passjava.member.dao;

import com.example.passjava.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:19:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
