package com.klu;

import org.apache.log4j.Logger;

public class Sample {
static final Logger logger=Logger.getLogger("Sample.class");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("sample debug message");
		logger.info("sample info mesasge");
		logger.warn("sample warn message");
		logger.error("sampleerror message");
		logger.fatal("sample fatal message");
	}

}
