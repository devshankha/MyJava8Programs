import java.util.function.Supplier;

class DatabaseConnection {
    public DatabaseConnection() {
        System.out.println("In the databaseConnection");
    }

}

public class TestSupplier1 {
    public static void main(String[] args) {
        // Both the below lines are equivalent
        Supplier<DatabaseConnection> con =() -> new DatabaseConnection();
        Supplier<DatabaseConnection> con1 =DatabaseConnection::new;
        System.out.println("In the middle step");
        con1.get();
        con.get();

    }




}
