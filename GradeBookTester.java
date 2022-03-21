import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook gb1 = new GradeBook(5);
	private GradeBook gb2 = new GradeBook(5);

	
	
	@BeforeEach
	void setUp() throws Exception {
		
		gb1.addScore(5);
		gb1.addScore(5);
		gb1.addScore(2);
		gb1.addScore(5);
		gb1.addScore(5);
		
		gb2.addScore(1);
		gb2.addScore(2);
		gb2.addScore(3);
		gb2.addScore(4);
		gb2.addScore(5);
		
	}

	@AfterEach
	void tearDown() throws Exception {

		gb1 = null;
		gb2 = null;
		
	}

	@Test
	void testAddScore() {
	
	assertEquals(5,gb1.getScoreSize());
	assertEquals(5,gb2.getScoreSize());
			
	}

	@Test
	void testSum() {
		assertEquals(22.0,gb1.sum());
		assertEquals(15.0,gb2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(2,gb1.minimum());
		assertEquals(1,gb2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(20,gb1.finalScore());
		assertEquals(14,gb2.finalScore());
	}

	@Test
	void testGetScoreSize() {
		assertEquals(5,gb1.getScoreSize());
		assertEquals(5,gb2.getScoreSize());
		
	}

	@Test
	void testToString() {
		assertTrue(gb1.toString().equals("5.0 5.0 2.0 5.0 5.0 "));
		assertTrue(gb2.toString().equals("1.0 2.0 3.0 4.0 5.0 "));
	}

}
