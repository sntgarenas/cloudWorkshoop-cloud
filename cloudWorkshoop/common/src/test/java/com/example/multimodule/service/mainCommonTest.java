package com.example.multimodule.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest("service.message=Hello")
public class mainCommonTest {

	@Autowired
	private MainCommon mainCommon;

	@Test
	public void contextLoads() {
		assertThat(mainCommon.message()).isNotNull();
	}

	@SpringBootApplication
	static class TestConfiguration {
	}

}
