package com.example.passjava.study.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.passjava.study.entity.StudyTimeEntity;
import com.example.passjava.study.service.StudyTimeService;
import com.example.common.utils.PageUtils;
import com.example.common.utils.R;



/**
 * 学习-用户学习时常表
 *
 * @author chenyw
 * @email chenyw@qq.com
 * @date 2022-07-22 14:22:44
 */
@RestController
@RequestMapping("study/studytime")
public class StudyTimeController {
    @Autowired
    private StudyTimeService studyTimeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("study:studytime:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = studyTimeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("study:studytime:info")
    public R info(@PathVariable("id") Long id){
		StudyTimeEntity studyTime = studyTimeService.getById(id);

        return R.ok().put("studyTime", studyTime);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("study:studytime:save")
    public R save(@RequestBody StudyTimeEntity studyTime){
		studyTimeService.save(studyTime);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("study:studytime:update")
    public R update(@RequestBody StudyTimeEntity studyTime){
		studyTimeService.updateById(studyTime);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("study:studytime:delete")
    public R delete(@RequestBody Long[] ids){
		studyTimeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

    /**
     * test: select member's study time
     */
    @RequestMapping("/member/list/{id}")
    public R memberStudyTimeTest(@PathVariable("id") Long id){
        // id暂时无效
        StudyTimeEntity studyTimeEntity = new StudyTimeEntity();
        studyTimeEntity.setTotalTime(100); //100min
        studyTimeEntity.setQuesType(2L); //javaBasic
        return R.ok().put("studytime",Arrays.asList(studyTimeEntity));
    }

}
