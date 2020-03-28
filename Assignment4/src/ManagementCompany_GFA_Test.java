import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class ManagementCompany_GFA_Test.
 */
public class ManagementCompany_GFA_Test {
	
	/** The p 1. */
	Property p1;
	
	/** The m. */
	ManagementCompany m ; 
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		m= new ManagementCompany("Railey", "555555555",6);
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		m=null;
	}

	/**
	 * Test add property.
	 */
	@Test
	public void testAddProperty() {
		p1 = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);
		 
		assertEquals(m.addProperty(p1),0,0);
	}




}