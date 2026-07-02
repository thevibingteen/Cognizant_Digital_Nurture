import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.info("Application started successfully.");

        logger.warn("Warning: Low disk space detected.");

        logger.error("Error: Unable to establish database connection.");

        logger.info("Application execution completed.");

    }

}