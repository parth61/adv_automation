package demo;


import org.apache.logging.log4j.*;


public class Log4jDemoClass {
	static Logger logger = LogManager.getLogger(Log4jDemoClass.class);
	
	public static void main(String[] args) {
		System.out.println("...Log4j Demo Started...");
		
		logger.trace("\nThis is trace msg");
		logger.info("This is info msg");
		logger.error("This is error msg");
		logger.warn("This is warning msg");
		logger.fatal("This is fatal msg");
		logger.debug("This is debug msg");
		
		System.out.println("...Completed...");
	}

}
