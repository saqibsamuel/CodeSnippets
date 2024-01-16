package edu.qc.seclass;

import org.junit.Test;

import junit.framework.TestCase;

public class BuggyClassTestSC2 extends TestCase {

	@Test
	public void test_BuggyClassTestSC2(){
		BuggyClass bc = new BuggyClass();
	    bc.buggyMethod2(1,1);
	}
}

