import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.lang.Thread.sleep;

class Retryer {
    public static <T> T retry(Supplier<T> operation, int maxAttempts) throws InterruptedException {
        RuntimeException lastException = null;
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                return operation.get();
            } catch (RuntimeException e) {
                lastException = e;

                boolean shouldRetry =
                        attempt < maxAttempts;


                if (!shouldRetry) {
                    throw e;
                }

            }
        }

        throw lastException;

    }

}






class TestSupplier3Retry {


    static String callRemoteApi() {
        System.out.println("Calling remote API");
        if (Math.random() < 0.7) {
            throw new RuntimeException("Temporary API failure");
        }
        return "API response";
    }

    public static void main(String[] args) throws InterruptedException {
        String result = Retryer.retry(() -> callRemoteApi(), 10);

        System.out.println(result);



    }





    }