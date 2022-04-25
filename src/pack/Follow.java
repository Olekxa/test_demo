package pack;

import java.util.Optional;

public class Follow {
    public static void main(String[] args) {
        Person mike = new Person("Mike", "mike@mail.com");
        Person andrey = new Person("Andrey", null);
        String email = andrey
                .getEmail()
                .map(String::trim)
                .orElse("User don't have mail");
        //////////////////////////////////////////////////////////////////////
        if (mike.getEmail().isPresent()) {
            String mikeMail = mike.getEmail().get();
        } else {
            System.out.println("User don't have mail");
        }
    }
}

class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
