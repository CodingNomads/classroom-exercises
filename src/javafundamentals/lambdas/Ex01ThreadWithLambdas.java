package javafundamentals.lambdas;

/**
 * Create a thread passing an anonymous class. Start it and it should print "Im anonymous"
 * Create another thread passing a lambda. Start it should print "Im a Lambda"
 */

public class Ex01ThreadWithLambdas {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm anonymous");
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> System.out.println("I'm a Lambda"));
        thread2.start();
    }
}
