import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class User {
    private final String name;
    private final String email;
    private final String password;
    User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
class UserDTO {
    private final String name;
    private final String email;

    public UserDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }
}









public class Function1 {






    public static void main(String[] args) {
        Function<User,UserDTO> func =user -> new UserDTO(user.getName(), user.getEmail());
        List<User> users = List.of(
                new User("Alice", "alice@example.com","anand"),
                new User("Bob", "bob@example.com","dqwdwqd")
        );
        List<UserDTO> usersDto =
        users.stream().map(func).collect(Collectors.toList());
        System.out.println(usersDto);





    }
}
