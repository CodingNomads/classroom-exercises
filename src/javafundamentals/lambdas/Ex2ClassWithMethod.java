package javafundamentals.lambdas;

import java.util.function.Consumer;

public class Ex2ClassWithMethod {
    public void going(Consumer<String> consumer, String name) {
        consumer.accept(name);
    }
}
