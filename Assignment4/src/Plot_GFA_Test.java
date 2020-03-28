import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class Plot_GFA_Test.
 */
public class Plot_GFA_Test {
	
	/** The plot 2. */
	private Plot plot1, plot2;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(1,1,2,2); 
		plot2 = new Plot(2,1,2,2);
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		plot1=plot2=null;
	}

	/**
	 * Test overlaps 1.
	 */
	@Test
	public void testOverlaps1() {
		assertTrue(plot1.overlaps(plot2)); //plot2 overlaps the right side of plot1
	}
}