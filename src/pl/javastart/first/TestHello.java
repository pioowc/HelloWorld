package pl.javastart.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHello {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFibo() {
		HelloWorld h = new HelloWorld();
		int i = h.fibo(3);
		int j = h.fibo(6);
		System.out.println("testFibo\n");
		
		assertEquals(i, 2);
		assertEquals(j, 8);
	}

	@Test
	void testFibo2() {
		HelloWorld h = new HelloWorld();
		int i = h.fibo2(3);
		int j = h.fibo2(6);
		System.out.println("testFibo2\n");
		
		assertEquals(i, 2);
		assertEquals(j, 8);
		assertTrue(j==2, "Blad danych fibo2 != fibo2");
	}

	
}
