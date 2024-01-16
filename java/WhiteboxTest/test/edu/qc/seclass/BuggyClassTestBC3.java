package edu.qc.seclass;

import org.junit.Test;

import junit.framework.TestCase;

public class BuggyClassTestBC3 extends TestCase{

	@Test
	public void test_BuggyClassTestBC3_Zero( ) {
		BuggyClass bc = new BuggyClass();
	    bc.buggyMethod3(1);
	}

	@Test
	public void test_BuggyClassTestBC3_Negative( ) {
		BuggyClass bc = new BuggyClass();
	    bc.buggyMethod3(-1);
	}


}