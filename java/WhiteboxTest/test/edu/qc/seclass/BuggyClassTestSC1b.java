package edu.qc.seclass;

import org.junit.Test;

import junit.framework.TestCase;

public class BuggyClassTestSC1b extends TestCase{

	@Test
	public void test_BuggyClassTestSC1b( ) {
		BuggyClass bc = new BuggyClass();
			bc.buggyMethod1(2);
	}

}

