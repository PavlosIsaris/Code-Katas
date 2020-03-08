package main.com.paulisaris.codekatas.bracketsvalidator;

public class Main {

    public static void main(String[] args) {
        BracketsValidator bracketsValidator = new BracketsValidator();

        System.out.println("{ [ ] ( ) } : " + bracketsValidator.validate("{ [ ] ( ) }"));
        System.out.println("{ [ ( ] ) } : " + bracketsValidator.validate(("{ [ ( ] ) }")));
        System.out.println("{ [ } : " + bracketsValidator.validate(("{ [ }")));
    }
}
