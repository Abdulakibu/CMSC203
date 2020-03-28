import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class ManagementCompanyTest.
 */
public class ManagementCompanyTest {
	
	/** The p 6. */
	Property p1 ,p2,p3,p4,p5,p6;
	
	/** The m. */
	ManagementCompany m ; 
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		p1 = new Property ("Almost Aspen", "Glendale", 4844.00, "Sammy Smith",2,1,2,2);
		p2 = new Property ("Ambiance", "Lakewood", 4114, "Tammy Taylor",4,1,2,2);
		p3 = new Property ("Bear Creek Lodge", "Peninsula", 4905, "Bubba Burley",6,1,2,2);
		m= new ManagementCompany("Railey", "555555555",6);
		System.out.println(1);
		m.addProperty(p1);
		System.out.println(2);
		m.addProperty(p2);
		System.out.println(3);
		m.addProperty(p3);

	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		p1=p2=p3=p4=p5=p6=null;
		m=null;
	}
			
	/**
	 * Test get MA X PROPERTY.
	 */
	@Test
	public void testGetMAX_PROPERTY() {
		assertEquals(m.getMAX_PROPERTY(),5);
	}

	/**
	 * Test add property.
	 */
	@Test
	public void testAddProperty() {
		p4 = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);
		p5 = new Property ("Mystic Cove", "Lakepointe", 5327, "Joey BagODonuts",4,5,2,2);
		p6 = new Property ("Too Many Properties", "Lakepointe", 1000, "Joey BagODonuts",6,5,2,2);
		 System.out.println("assert");
		assertEquals(m.addProperty(p4),3,0);
//		assertEquals(m.addProperty(p5),4,0);
		assertEquals(m.addProperty(p6),-1,0);  //exceeds the size of the array and can not be added, add property should return -1	
	}

//	@Test
//	public void testTotalRent() {
//		assertEquals(m.totalRent(),13863.0,0);
//	}

//	@Test
//	public void testMaxRentProperty() {
//		//assertEquals(m.maxRentProperty(),2,0);
//		String maxRentString = m.maxRentProp().split("\n")[3];
//		assertTrue(maxRentString.contains("4905.0"));
//	}
	

	/*
	@Test
	public void testDisplayPropertyAtIndex() {
		//find and print the third property
		String prop = m.displayPropertyAtIndex(2);
		//split the toString into an array
		String[] propArray = prop.split(" ");
		//test that the last element of the toString is the rent of the third property
		assertEquals(propArray[propArray.length-1],"4905.0");
	}
	*/

}