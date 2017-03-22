package javaschool.app;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import java.io.IOException;

/**
 * Created by Javacourses on 15.03.2017..
 */
public class Main {
    //?list pokazyvaet kakie komandy estj
    @Command
    public String hello() {
        return "World is not";
    }

    @Command
    public String hello(String name) {
        return "Hello " + name + "!";    //Vezyvaem metod s parametrom
    }


    public static void main(String[] ergs) throws IOException {
        ShellFactory
                .createConsoleShell("hello", "This is Phonebook.", new PhoneBook())
                .commandLoop();
    }


}
