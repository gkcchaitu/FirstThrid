package com.epam.TDDJunitTask;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DeletingAsTest {

	
	@Test
	void test1() {
		assertEquals("BCD",DeletingAs.del("ABCD"));
	}
	@Test
	void test2() {
		assertEquals("CD",DeletingAs.del("AACD"));
	}
	@Test
	void test3() {
		assertEquals("BCD",DeletingAs.del("BACD"));
	}
	@Test
	void test4() {
		assertEquals("BBAA",DeletingAs.del("BBAA"));
	}
	@Test
	void test5() {
		assertEquals("BAA",DeletingAs.del("AABAA"));
	}
	@Test
	void test6() {
		assertEquals("",DeletingAs.del(""));
	}
	@Test
	void test7() {
		assertEquals("",DeletingAs.del("A"));
	}

}
