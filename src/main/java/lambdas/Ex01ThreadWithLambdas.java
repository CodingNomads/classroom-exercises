package lambdas;

/**
 * Create a thread passing an anonymous class. Start it and it should print "Im anonymous"
 * Create another thread passing a lambda. Start it should print "Im a Lambda"
 */

public class Ex01ThreadWithLambdas {

    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Im anoymous"));

        Thread t1 = new Thread(() -> System.out.println("Im a lambda"));

        t.start();
        t1.start();

    }
}

