package excercise;

public class ChangableLogHandler extends LogHandler {

    public ChangableLogHandler(Logger logger) {
        super(logger);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}
