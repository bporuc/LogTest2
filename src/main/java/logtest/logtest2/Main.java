package logtest.logtest2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Patryk
 */
public class Main {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Main.class);
        logger.debug("Debug Message Logged !!!");
        logger.info("Info Message Logged !!!");
        logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
    }
}
