import excercise.*;

public class Main {

    public static void main(String[] args) {
        Logger logger = new PlainLogger();
        MultiLogHandler logHandler = new MultiLogHandler(logger);

        logHandler.addLogger(new UppercaseLogger());
        logHandler.addLogger(new UppercaseLogger());
        logHandler.addLogger(new NumberLogger());
        logHandler.addLogger(new PlainLogger());

        logHandler.handleLog("Hello world");
        logHandler.handleLog("Good world");
    }

}

/*
        Greeter greeter = new Greeter();
        UserInformationRetriever userInformationRetriever = new UserInformationRetriever();

        String name = userInformationRetriever.getName();
        int greetingNumber = userInformationRetriever.getGreetingNumber();

        greeter.greet(name, greetingNumber);
 */
