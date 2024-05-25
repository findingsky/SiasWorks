package math;

import junit.framework.TestCase;

public class MathTest extends TestCase {
	
	private Math add;
	
	private Math sub;
	
	private int x1,y1,x2,y2;

	protected void setUp() throws Exception {
		add = new Math();
		x1 = 2;
		y1 = 3;
		x2 =4;
		y2 = 5;
		sub=new Math();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}


	public void testSubmath() {
		assertEquals(sub.submath(x1, y1),-1);
		assertEquals(sub.submath(x2, y2),-1);
	}

	public void testAddmath() {
		assertEquals(add.addmath(x1, y1),5);
		assertEquals(add.addmath(x2, y2),9);
	}

}
