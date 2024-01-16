package edu.qc.seclass;

import org.junit.Test;

import junit.framework.TestCase;

public class BuggyClassTestSC1a extends TestCase{

	@Test
	public void test_BuggyClassTestSC1a() {
		BuggyClass bc = new BuggyClass();
		double result = bc.buggyMethod1(3);
		assertEquals(1.0,result);
	}
}