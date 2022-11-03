package encapsulation;

import java.util.Scanner;

public class UserInformationRetriever {

    private Scanner scanner = new Scanner(System.in);

    String getName() {
        System.out.println("Enter your name");
        String name = scanner.next();
        return name;
    }

    int getGreetingNumber() {
        System.out.println("Enter your greeting");
        int greetingNumber = scanner.nextInt();
        return greetingNumber;
    }

}
