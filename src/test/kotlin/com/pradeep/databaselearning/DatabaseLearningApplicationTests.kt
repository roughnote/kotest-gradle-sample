package com.pradeep.databaselearning

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest
@ContextConfiguration(initializers = [TestContainersInitializer::class])
class DatabaseLearningApplicationTests {

	@Test
	fun contextLoads() {
	}

}
