package excercise;

import java.util.ArrayList;
import java.util.List;

public class MultiLogHandler extends LogHandler {

    private List<Logger> loggers = new ArrayList<>();

    public MultiLogHandler(Logger logger) {
        super(logger);
    }

    public MultiLogHandler(List<Logger> loggers) {
        super(loggers.get(0));
        this.loggers = loggers;
    }

    public void addLogger(Logger logger) {
        loggers.add(logger);
    }

    public void handleLog(String message) {
        for (Logger logger : loggers) {
            logger.log(message);
        }
    }
}
