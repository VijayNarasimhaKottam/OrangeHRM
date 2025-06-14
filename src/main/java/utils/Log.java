package utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
    static Logger logger = Logger.getLogger(Log.class);

    static {
        PropertyConfigurator.configure("log4j.properties");
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void startTestCase(String testCaseName) {
        logger.info("==== START: " + testCaseName + " ====");
    }

    public static void endTestCase(String testCaseName) {
        logger.info("==== END: " + testCaseName + " ====");
    }
}