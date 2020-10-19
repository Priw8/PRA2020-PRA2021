package introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    static Logger logger = Logger.getLogger("name");

    public static void main(String [ ] args) {
        logger.info("Hello from logger");
        System.out.println("Hello World");
    }
}