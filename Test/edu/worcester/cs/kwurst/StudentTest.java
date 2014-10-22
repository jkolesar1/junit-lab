package edu.worcester.cs.kwurst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	private Student student1;
	@Before
	public void setUp() throws Exception {
		student1 = new Student("Jane", "Smith");
	}

	@Test
	public void testGetCurrentEarnedCr() {
		 int credits = 45;
		 student1.setCurrentEarnedCr(credits);
		 assertEquals(credits, student1.getCurrentEarnedCr());
	}
	
	@Test
	public void testGetAnticipatedAdditionalCr() {
		int credits = 50;
		student1.setCurrentEarnedCr(credits);
		student1.setAnticipatedAdditionalCr(120 - credits);
		assertEquals(120 - credits, student1.getAnticipatedAdditionalCr());
	}
	
	@Test
	public void readyToGraduate1(){
		 student1.setCurrentEarnedCr(120);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertTrue(student1.readyToGraduate());
	}
	
	@Test
	public void readyToGraduate2(){
		 student1.setCurrentEarnedCr(120);
		 student1.setGpa(1.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertFalse(student1.readyToGraduate());
	}
	
	@Test
	public void readyToGraduate3(){
		 student1.setCurrentEarnedCr(20);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertFalse(student1.readyToGraduate());
	}
	
	@Test
	public void readyToGraduate4(){
		 student1.setCurrentEarnedCr(120);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(false);
		 student1.setLascComplete(true);
		 assertFalse(student1.readyToGraduate());
	}
	
	@Test
	public void readyToGraduate5(){
		 student1.setCurrentEarnedCr(120);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(false);
		 assertFalse(student1.readyToGraduate());
	}
	
	@Test
	public void readyToGraduate6(){
		 student1.setCurrentEarnedCr(121);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertTrue(student1.readyToGraduate());
	}
	
	@Test
	public void getCurrentRemainingCr(){
		 student1.setCurrentEarnedCr(125);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertTrue(student1.readyToGraduate());
	}

	@Test
	public void getCurrentRemainingCr2(){
		 student1.setCurrentEarnedCr(120);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertTrue(student1.readyToGraduate());
	}
	
	@Test
	public void getCurrentRemainingCr3(){
		 student1.setCurrentEarnedCr(115);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertFalse(student1.readyToGraduate());
	}
	
	@Test
	 public void testStudentCount() {
		int count = Student.getStudentCount();
		new Student("Joe", "Jones");
		assertEquals(count + 1,Student.getStudentCount());
	 }
	
	@Test
	public void testStudentID() {
		int count = Student.getStudentCount();
		Student s2 = new Student("Joe", "Jones");
		assertEquals(String.format("%07d", count+1),s2.getId());
	}
}
