import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MM implements Callable {

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(9000);

        } catch (Exception e) {

        }
        return "fine";
    }
}


public class Concurrency {

    // Simple example showing CompletableFuture


    public static void main(String[] args) throws Exception {
       /* MM m = new MM();
        ExecutorService exec = Executors.newFixedThreadPool(4);
        Future f =  exec.submit(m);
        System.out.println(f.get());
        System.out.println("Got this this");*/

        CompletableFuture<String> comp = CompletableFuture
                .supplyAsync(()-> {
                    for (int i=0; i < 3;i++) {
                        try {
                            Thread.sleep(3000);
                            System.out.println("The value given is "+i+ " "+Thread.currentThread());

                        } catch (Exception e) {

                        }
                    }
                    return "MMMM";
                });
        for (int i=0; i < 3;i++) {
            try {
                Thread.sleep(3000);
                System.out.println("MMMMMMMMMMM "+i+ " "+Thread.currentThread());

            } catch (Exception e) {

            }
        }
       // exec.shutdown();



    }
}
