import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = {{1,2,3},{4,5},{6,7,8,9}};
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		assertEquals(45.0,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT));
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		assertEquals(5.0,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT));
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 1));	
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(14.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 1));
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT));
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * 
	 */
	@Test
	public void testWriteToFile() {
		outputFile = new File("TestOut.txt");
		double[][] array=null;
		TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT, outputFile);
		array = TwoDimRaggedArrayUtility.readFile(outputFile );
		assertEquals(1, array[0][0]);
        assertEquals(2, array[0][1]);
        assertEquals(3, array[0][2]);
        assertEquals(4, array[1][0]);
        assertEquals(5, array[1][1]);
        assertEquals(6, array[2][0]);
        assertEquals(7, array[2][1]);
        assertEquals(8, array[2][2]);
        assertEquals(9, array[2][3]);	
	}

}
