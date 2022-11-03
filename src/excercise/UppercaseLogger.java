package excercise;

public class UppercaseLogger implements Logger {

    @Override
    public void log(String message) {
        String upperCaseMessage = message.toUpperCase();
        System.out.println(upperCaseMessage);
    }

}
