package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Eventlogger {
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;

	public Eventlogger(String fileName) {
		try {
			logmanager=LogManager.getLogManager();
			logger=logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler=new FileHandler(fileName);
			logger.addHandler(filehandler);
			filehandler.setFormatter(new SimpleFormatter());
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage) {
		logger.info(logMessage);
	}
}
