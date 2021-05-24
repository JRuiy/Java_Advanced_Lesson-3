package ua.lviv.lgs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggerFile {

	public static Logger LOG = Logger.getLogger(LoggerFile.class);
	
	public static void main(String[] args) {
		logWithDOMConfigurator();
		
	}
	
	
	public static void logWithDOMConfigurator() {
		DOMConfigurator.configure("loggerConfig.xml");	
		LOG.trace("TRACE Logger mesaage of project");
		LOG.debug("DEBUG Logger mesaage of project");
		LOG.info("INFO Logger mesaage of project");
		LOG.warn("WARN Logger mesaage of project");
		LOG.error("ERROR Logger mesaage of project");
		LOG.fatal("FATAL Logger mesaage of project");
	}
	
}
