package com.jenkindemo.JenkinsDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorkLog {

	WorkLog workLog=new WorkLog();
	
	
	@Test
	public void testAddLog1() {
	
		assertEquals(" Added Log For Remo",workLog.addToLog("Remo"));
	}
	
	@Test
	public void testAddLog2() {
	
		assertEquals(" Added Log For Jeeva",workLog.addToLog("Jeeva"));
	}
	
	@Test
	public void testAddLogins1() {
	
		assertEquals(" Added Login Log For Jeeva",workLog.addLogins("Jeeva"));
	}
	
	@Test
	public void testAddLogins2() {
	
		assertEquals(" Added Login Log For Steve",workLog.addLogins("Steve"));
	}
	
	
}
