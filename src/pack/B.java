package pack;

import java.util.Optional;

public class B {
    public static void main(String[] args) {

        Optional<String> withException = Optional.of(null); //Will throw NPE
        Optional<String> emptyOptional = Optional.ofNullable(null); //Ready tu work with null

        String resultOfOptional = emptyOptional.orElse("Anything but not null!!!");
        /////////////////////////////////////////////////////////////////////////////////////

        String itNull = null;
        String oldWayResult;
        if (itNull == null) {
            oldWayResult = " How it was before Optional";
        }
        Optional<String> string = Optional.ofNullable("this for test");//

        String orElse = string.map(String::toUpperCase)
                                .orElse("Will be print if null if comes null");
        String orElseGet = string.map(String::toUpperCase)
                                .orElseGet(()->{//logic (here comes Supplier)
                                  return "result of Supplier";});

    }
}
