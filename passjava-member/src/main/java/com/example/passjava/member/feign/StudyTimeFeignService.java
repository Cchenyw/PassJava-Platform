package com.example.passjava.member.feign;

import com.example.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("passjava-study")
public interface StudyTimeFeignService {
    // 这个地址配置的是调用服务的远程接口地址
    @RequestMapping("study/studytime/member/list/{id}")
    R getMemberStudyTimeListTest(@PathVariable("id") Long id);
}
