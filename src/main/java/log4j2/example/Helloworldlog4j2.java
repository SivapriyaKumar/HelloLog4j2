package log4j2.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Helloworldlog4j2 {


	    private static Logger log = LogManager.getLogger(Helloworldlog4j2.class); //Logger Object

	    public static void main(String[] args) {

	        log.debug("This will be printed during Debug");
	        log.info("This will be printed during Info");
	        log.warn("This will be printed during Warning");
	        log.error("This will be printed during Error");
	    
	    }
}