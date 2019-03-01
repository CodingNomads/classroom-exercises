package enums;

/**
 * Create an enum representing some different values.
 * Use it in a switch statement.
 */

public class Ex01Enums {


    public static void main(String[] args) {
        Runnable target = new Greeter();
        Thread thread = new Thread(target);
        thread.start();

        Runnable selamatDatang = () -> System.out.println("Selamat datang");
        selamatDatang.run();


        new Thread(selamatDatang).start();

        new Thread(() -> System.out.println("My methods")).start();
    }
}
