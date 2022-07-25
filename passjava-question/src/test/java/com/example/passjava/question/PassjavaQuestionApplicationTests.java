package com.example.passjava.question;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.passjava.question.entity.TypeEntity;
import com.example.passjava.question.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PassjavaQuestionApplicationTests {

	@Autowired
	TypeService typeService;

	@Test
	void testCreateType() {
		TypeEntity typeEntity = new TypeEntity();
		typeEntity.setType("javaBasic");
		typeService.save(typeEntity);
		System.out.println("create success !");
	}

	@Test
	void testUpdateType(){
		TypeEntity typeEntity = new TypeEntity();
		typeEntity.setId(1L);
		typeEntity.setType("jvm");
		typeService.updateById(typeEntity);
		System.out.println("edit success !");
	}

	@Test
	void testSearchType(){
		List<TypeEntity> typeEntityList = typeService.list(new QueryWrapper<TypeEntity>().eq("id",1L));
		typeEntityList.forEach((item)->{
			System.out.println(item);
		});
		System.out.println("search success !");
	}

	@Test
	void testDelete(){
		typeService.removeById(1L);
		System.out.println("delete success !");
	}

}
