package com.example.passjava.content.dao;

import com.example.passjava.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:15:54
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
