package excercise;

public class PlainLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }

}
