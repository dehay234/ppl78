package logging;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class Logging {
    private static Logger logger=null;

    public static Logger getLogger() {
        return logger;
    }

    public Logging(String path) throws IOException {
        logger = Logger.getGlobal();
        System.setProperty("java.util.logging.config.file", path);
        Handler consoleHandler= new FileHandler("D:\\Users\\user\\IdeaProjects\\ppl4\\src\\logging\\Log1.log");
        consoleHandler.setFormatter(new Format());
        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false);
    }
    static class Format extends Formatter {
        @Override
        public String format(LogRecord record) {
            return new Date(record.getMillis())+" "+record.getLevel()+": "+record.getMessage()+"\n";
        }
    }
}
