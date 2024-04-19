package com.dzoms.userservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    @DisplayName("1 equals 1?")
	void test() {
		Assertions.assertEquals(1, 1);
	}
}
