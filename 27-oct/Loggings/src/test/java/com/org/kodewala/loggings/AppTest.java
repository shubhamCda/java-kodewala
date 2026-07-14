package com.org.kodewala.loggings;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
//package test.testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppTest {

	private static final Logger logger = LogManager.getLogger(AppTest.class);

	public static void main(String[] args) {
		logger.error("Something went wrong");
		logger.trace("Trace message");
		logger.debug("Debug message");
		logger.info("Application Started");
		logger.warn("Warning message");
		
	}
}