package javafundamentals.lambdas;

/**
 * Create a thread passing an anonymous class. Start it and it should print "Im anonymous"
 * Create another thread passing a lambda. Start it should print "Im a Lambda"
 */

public class Ex01ThreadWithLambdas {

    public static void main(String[] args) {
        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Im anonymous");
            }
        });
        firstThread.start();
        Thread secondThread = new Thread(()->
                System.out.println("Im a Lambda"));
        secondThread.start();
    }

}
