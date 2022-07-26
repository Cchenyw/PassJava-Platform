package com.example.passjava.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.passjava.member.feign.StudyTimeFeignService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.passjava.member.entity.MemberEntity;
import com.example.passjava.member.service.MemberService;
import com.example.common.utils.PageUtils;
import com.example.common.utils.R;


/**
 * 会员-会员表
 *
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:19:59
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private StudyTimeFeignService studyTimeFeignService;

    /**
     * 远程调用passjava-study的memberStudyTimeTest
     */
    @RequestMapping("/studytime/list/{id}")
    public R MemberStudyTimeTest(@PathVariable("id") Long id) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(1L);
        memberEntity.setNickname("w10");
        R studyTimeList = studyTimeFeignService.getMemberStudyTimeListTest(id);
        return R.ok().put("memberinfo",memberEntity).put("studytime",studyTimeList.get("studytime"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id) {
        MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member) {
        memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member) {
        memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids) {
        memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
