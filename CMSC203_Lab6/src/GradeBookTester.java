import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook gb1;
	GradeBook gb2;
	@BeforeEach
	void setUp() throws Exception {
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		gb1.addScore(5);
		gb1.addScore(3);
		gb2.addScore(8);
		gb2.addScore(6);
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1 = null;
		gb2 = null;
	}

	@Test
	void testAddScore() {
		String scores = gb1.toString();
		String[] split = scores.split("\\s+");
		assertTrue(split[0].equals("5.0"));
		assertTrue(split[1].equals("3.0"));
		assertTrue(split[2].equals("0.0"));
		assertTrue(split[3].equals("0.0"));
		assertTrue(split[4].equals("0.0"));
		assertEquals(split.length,5);
		
		String scores2 = gb2.toString();
		String[] split2 = scores2.split("\\s+");
		assertTrue(split2[0].equals("8.0"));
		assertTrue(split2[1].equals("6.0"));
		assertTrue(split2[2].equals("0.0"));
		assertTrue(split2[3].equals("0.0"));
		assertTrue(split2[4].equals("0.0"));
		assertEquals(split2.length,5);
	}

	@Test
	void testSum() {
		assertEquals(8, gb1.sum());
		assertEquals(14, gb2.sum());
	}
////
	@Test
	void testMinimum() {
		assertEquals(3, gb1.minimum());
		assertEquals(6, gb2.minimum());
	}
//
	@Test
	void testFinalScore() {
		assertEquals(5, gb1.finalScore());
		assertEquals(8, gb2.finalScore());
	}
//
	@Test
	void testGetScoreSize() {
		assertEquals(2,gb1.getScoreSize());
		assertEquals(2,gb2.getScoreSize());
	}

	@Test
	void testToString() {
		assertTrue(gb1.toString().equals("5.0 3.0 0.0 0.0 0.0 "));
	}

}
