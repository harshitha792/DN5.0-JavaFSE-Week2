import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        logger.warn("Warning Message");

        logger.error("Error Message");
    }
}