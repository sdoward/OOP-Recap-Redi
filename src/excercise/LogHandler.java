package excercise;

public class LogHandler {
    protected Logger logger;

    public LogHandler(Logger logger) {
        this.logger = logger;
    }

    public void handleLog(String message) {
        logger.log(message);
    }

}
