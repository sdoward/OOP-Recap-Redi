package excercise;

public class NumberLogger extends UppercaseLogger {

    public void log(String message) {
        super.log(message);
        System.out.println(" message count: " + message.length());
    }
}
