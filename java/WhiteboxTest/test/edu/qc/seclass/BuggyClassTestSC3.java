package edu.qc.seclass;

import org.junit.Test;

import junit.framework.TestCase;

public class BuggyClassTestSC3 extends TestCase {

	@Test
	public void test_BuggyClassTestSC3( ) {
		BuggyClass bc = new BuggyClass();
	    bc.buggyMethod3(3);
	}
}