package pack;

import java.util.Optional;

public class C {public static void main(String[] args) {
    Optional<String> emptyOptional = Optional.ofNullable(null);
    Optional<String> fullOptional = Optional.ofNullable("full");

    //                            Consumer              Runnable action
    emptyOptional.ifPresentOrElse(System.out::println, ()-> System.out.println("if comes null"));
    fullOptional.ifPresentOrElse(System.out::println, ()-> System.out.println("you cant see this result"));

}
}
