//to implement a retrier logic
//this is required




@FunctionalInterface
interface RetryImplementation {
    void run() ;
}


public class RetryUtils {

    int NO_OF_ATTEMPTS;
    final long TIME_TO_WAIT;

    RetryUtils(int retryAttempts, long timeToWait) {
        this.NO_OF_ATTEMPTS = retryAttempts;
        this.TIME_TO_WAIT = timeToWait;
    }

    public void retryLogics(RetryImplementation retryable,  String message) {
        int counter = 0;
        boolean isSuccessful = false;

        while (counter < NO_OF_ATTEMPTS) {
            try {
                 retryable.run();
                 isSuccessful = true;
            } catch (Exception e) {
                System.out.println("If it enters here");
                counter++;


                try {
                    Thread.sleep(TIME_TO_WAIT);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
            if (isSuccessful) {
                break;
            }
        }

      //  throw new ClassCastException("mmkdwqdw");
        if (!isSuccessful)
        throw new RuntimeException(message);
    }

    public static void main(String[] args) {
        RetryUtils s = new RetryUtils(3,1000);
        try {
            s.retryLogics(() -> {

                System.out.println("MMMKKKKKKK");
                int a = 1;
                if (a == 1)
                    throw new NullPointerException();


            },"Couldnot find ip");
        } catch (Exception e) {
            System.out.println("Exception caught");
            throw e;
        }

    }

}
