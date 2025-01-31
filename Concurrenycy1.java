import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concurrenycy1 {

    // Simple example showing how CompletableFuture works and can be combined

    public static void main(String[] args) {
        System.out.println("The value given here");
        CompletableFuture<String> comp1 = CompletableFuture
                .supplyAsync(()-> {
                    for (int i=0; i < 3;i++) {
                        try {
                            Thread.sleep(1000);
                            System.out.println("The value given is "+i+ " "+Thread.currentThread()+" "+Thread.currentThread().getName());

                        } catch (Exception e) {

                        }
                    }
                    return "MMMM";
                });

        CompletableFuture<String> comp2 = comp1.thenCompose(s->
                CompletableFuture.supplyAsync(()->{
                    for (int i=0; i < 3;i++) {
                        try {
                            Thread.sleep(1000);
                            System.out.println("The value given is "+i+ " "+" "+s+" "+Thread.currentThread()+" "+Thread.currentThread().getName());

                        } catch (Exception e) {

                        }
                    }
                    return "AAAA";

        }));
        try {
            Thread.sleep(8000);

        } catch (Exception e) {

        }
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(comp1,comp2);















    }
}
