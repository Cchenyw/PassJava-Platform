package com.example.passjava.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.passjava.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:19:59
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

