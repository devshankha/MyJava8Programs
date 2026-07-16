import java.util.List;
import java.util.function.Consumer;

//Uses of consumer


class User {
    String name;
    boolean active;

    User(String name) {
        this.name = name;
    }
}



public class TestConsumer {

    //Passing behavior into a method
    static void processMessage(String message, Consumer<String> action) {
        action.accept(message);
    }


    public static void main(String[] args) {
        //Printing or processing each data item
        List<String> names = List.of("Alice", "Bob", "Charlie");
        Consumer<String> con = (s)-> {
            System.out.println(s.toUpperCase());
        };
        names.forEach(con);
        //Modifying an object
        User user = new User("Alice");
        Consumer<User> con2 = (u) -> {u.active = true;};
        con2.accept(user);
        processMessage("Hello", msg -> System.out.println(msg.toUpperCase()));
        processMessage("Hello", msg -> System.out.println("Log: " + msg));




    }
}
