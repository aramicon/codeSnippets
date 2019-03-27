package unitTest;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class Test1 {
	@BeforeClass
	public static void setUpClass() {
		System.out.println("This is executed once before all tests");
	}

	@Before
	public void setUp() {
		System.out.println("This is executed before every test");
	}

	
	@After
	public void tearDown() {
		System.out.println("This is executed after every test");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("This is executed once after all tests");
	}
	
	@Test
	public void testAdd() {
		Tester t = new Tester();
	    int a = 10;
	    int b = 5;
	    int actual = t.add(a, b);
	 
	    int expected = 15;
	 System.out.println("Test Add");
	    assertEquals(expected, actual);
	}

	@Test
	public void testTake() {
		Tester t = new Tester();
	    int a = 10;
	    int b = 5;
	    int actual = t.take(a, b);
	 
	    int expected = 15;
	    System.out.println("Test Take");
	    assertEquals(expected, actual);
	}
	@Test
	public void testProduct(){
		Tester t = new Tester();
	    int a = 10;
	    int b = 5;
	    int actual = t.product(a, b);
	 
	    int expected = 50;
	    System.out.println("Test Product");
	    assertEquals(expected, actual);
	    assertNotEquals(expected, 50);
	}
	@Test
	public void testDivide(){
		Tester t = new Tester();
	    int a = 10;
	    int b = 5;
	    int actual = t.divide(a, b);
	    System.out.println("Test Divide");
	    int expected = 20;
	 
	    assertEquals(expected, actual);
	    assertNotEquals(expected, 2);
	}
}