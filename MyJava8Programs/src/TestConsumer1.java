//Pass an action as a callback
//The same method supports different completion actions without hardcoding them. 
//A Consumer does not make execution asynchronous; these callbacks run when accept is called.
import java.util.function.Consumer;

class Order {
    final int id;

    Order(int id) {
        this.id = id;
    }
}

class OrderService {
    void save(Order order, Consumer<Order> afterSave) {
        System.out.println("Saving order " + order.id);

        // database save would happen here

        afterSave.accept(order);
    }
}


public class TestConsumer1 {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        service.save(new Order(101), order ->
                System.out.println("Sending email for order " + order.id)
        );

        service.save(new Order(102), order ->
                System.out.println("Writing audit log for order " + order.id)
        );
    }
}
