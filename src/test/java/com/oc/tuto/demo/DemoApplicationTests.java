package com.oc.tuto.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.oc.tuto.demo.model.AmazingBean;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private AmazingBean myBean;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testAmazingBean() {
		assertEquals("Ca va?", myBean.getInfo().trim());
	}

}
