package com.klu;

import org.apache.log4j.Logger;

public class SampleDemo {

	static final Logger logger=Logger.getLogger("SampleDemo.class");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("sample debug");
		logger.info("sample info");
		logger.warn("sample warn");
		logger.error("sampel error");
	}

}
