package edu.qc.seclass;

import org.junit.Test;

import junit.framework.TestCase;

public class BuggyClassTestBC2 extends TestCase {

	@Test
	public void test_BuggyClassTestBC2( ) {
		BuggyClass bc = new BuggyClass();
		bc.buggyMethod2(1,1);
	    bc.buggyMethod2(0,1);
	}
}