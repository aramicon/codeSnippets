import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test3 {

	@Before
	public static void setUpBeforeClass() throws Exception {
	System.out.println("This should only execute once: before all tests");
	}

	@After
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This should only execute once: after all tests");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This should execute before every test");
	}

	@AfterClass
	public void tearDown() throws Exception {
		System.out.println("This should execute after every test");
	}

	
	public void testNull() {
		Vehicle v = new Vehicle();
		v = null;
		assertNull(v);
	}
	@Test
	public void testNotNull() {
		
		assertNotNull(v);
	}
	//@Test
	
	@Test
	public void testNotSame() {
		Vehicle vc = new Car();
		Car c = new Car();
		Car c1 = new Car();
		assertNotSame(vc, c);
		assertSame(c, c1);
	}
}