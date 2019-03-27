import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testIsZero() {
		TestBoolean tb = new TestBoolean();
		
		assertTrue(tb.isZero(0));
		assertFalse(tb.isNotZero(5));
	}
	@Test
	public void testIsNotZero() {
		TestBoolean tb = new TestBoolean();
		
		assertTrue(tb.isZero(5));
		assertFalse(tb.isNotZero(0));
	}
	
}
