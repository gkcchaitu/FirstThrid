package com.klu;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class JunitTest {

	@Test
	public void test() {
		assertThat("abc",CoreMatchers.is("123"));
	}

}
