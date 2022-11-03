package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Greeter {

    private List<String> greetings = new ArrayList<>();

    public Greeter() {
        this.greetings = greetings;
        greetings.add("Nice to meet you");
        greetings.add("Greetings");
        greetings.add("Whats up?");
    }

    void greet(String name, int greetingNumber){
        String greeting = "Hello " + name + ", " + greetings.get(greetingNumber);
        System.out.println(greeting);
    }
}
