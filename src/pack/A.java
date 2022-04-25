package pack;

import java.util.ArrayList;
import java.util.Optional;

public class A {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        Optional<String> full = Optional.of("I'm full of Strings");

        System.out.println("Result of empty:");

        System.out.println(empty.isEmpty());
        System.out.println(full.isEmpty());

        System.out.println("Result of isPresent:");

        System.out.println(empty.isPresent());
        System.out.println(full.isPresent());

    }
}
