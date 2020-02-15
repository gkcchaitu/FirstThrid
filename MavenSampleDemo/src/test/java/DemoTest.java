import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test() {
		Demo d=new Demo();
		assertEquals("hello",d.sayHello());
	}

}
