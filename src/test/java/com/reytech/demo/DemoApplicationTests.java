package com.reytech.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
	@Test
	void groupAssertions(){
	Personne pers = new Personne("Nassur","Mouhamadi");
	assertAll("peronne",()-> assertEquals("Nassure", pers.getFirstName()),
	() -> assertEquals("Mouhamadi",pers.getLastName()));
	}
	

	@Test
	void contextLoads() {
	}

}
