package hw4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FA_testingTest {

	void fn1test_1() {
		assertTrue(FA_testing.fn1("ab"));
		assertTrue(FA_testing.fn1("z"));
	}
	
	@Test
	void fn1test_2() {
		assertTrue(FA_testing.fn1("aba"));
		assertTrue(FA_testing.fn1("abaaaaaaaaaaaaa"));
		assertTrue(FA_testing.fn1("zaaaaaa"));
	}
	
	@Test
	void fn1test_3() {
		String s = "ab";
		for(int i = 0; i < 1000; i++) {
			assertTrue(FA_testing.fn1(s));
			s = s + "a";
		}
		
	}
	
	@Test
	void fn1test_4() {
		assertFalse(FA_testing.fn1("a"));
		assertFalse(FA_testing.fn1("zb"));
		assertFalse(FA_testing.fn1("zaaaaaaab"));
	}
	
	@Test
	void fn2test_1() {
		assertTrue(FA_testing.fn2(""));
		assertTrue(FA_testing.fn2("a"));
		assertTrue(FA_testing.fn2("b"));
	}
	
	@Test
	void fn2test_2() {
		assertFalse(FA_testing.fn2("ba"));
		assertFalse(FA_testing.fn2("aba"));
		assertFalse(FA_testing.fn2("c"));
	}
	
	@Test
	void fn2test_3() {
		assertTrue(FA_testing.fn2("aaaaaaaa"));
		assertTrue(FA_testing.fn2("bbbbbbbbbbbb"));
		assertTrue(FA_testing.fn2("aaaaabbbbb"));
	}
	
	@Test
	void fn2test_4() {
		String s = "";
		for(int i = 0; i < 1000; i++) {
			assertTrue(FA_testing.fn2(s));
			s = "a" + s + "b";
		}
	}
	
	@Test
	void fn3test_1() {
		assertTrue(FA_testing.fn3("aaaa"));
		assertTrue(FA_testing.fn3("bbbb"));
		assertTrue(FA_testing.fn3("cccc"));
	}
	
	@Test
	void fn3test_2() {
		assertFalse(FA_testing.fn3("aaa"));
		assertFalse(FA_testing.fn3("bbbd"));
		assertFalse(FA_testing.fn3("ccc "));
	}
	
	@Test
	void fn4test_1() {
		assertTrue(FA_testing.fn4(""));
		assertTrue(FA_testing.fn4("aa"));
		assertTrue(FA_testing.fn4("ba"));
		assertTrue(FA_testing.fn4("aabb"));
		assertTrue(FA_testing.fn4("abcdbcab"));
	}
	
	@Test
	void fn4test_2() {
		assertFalse(FA_testing.fn4("a"));
		assertFalse(FA_testing.fn4("aaa"));
		assertFalse(FA_testing.fn4("add"));
		assertFalse(FA_testing.fn4("abababa"));
		assertFalse(FA_testing.fn4("de"));
	}
	
	@Test
	void fn5test_1() {
		assertTrue(FA_testing.fn5("aaaaa"));
		assertTrue(FA_testing.fn5("ababa"));
		assertTrue(FA_testing.fn5("aabaa"));
		assertTrue(FA_testing.fn5("bbabb"));
		assertTrue(FA_testing.fn5("abbba"));
	}
	
	@Test
	void fn5test_2() {
		assertFalse(FA_testing.fn5("aaa"));
		assertFalse(FA_testing.fn5(""));
		assertFalse(FA_testing.fn5("ababb"));
		assertFalse(FA_testing.fn5("ababab"));
		assertFalse(FA_testing.fn5("acaca"));
	}

}
