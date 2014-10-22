package edu.worcester.cs.kwurst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTestAdditionalCredits {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAnticipatedAdditionalCr() {
		Student student1 = new Student("Jane", "Smith");
		int credits = 50;
		student1.setCurrentEarnedCr(credits);
		student1.setAnticipatedAdditionalCr(120 - credits);
		assertEquals(120 - credits, student1.getAnticipatedAdditionalCr());
	}

}
