package LearnFunctionalInterfaces;

import java.util.function.Predicate;

public class LearnPredicate {

    public static void main(String args[]) {
        Predicate<Integer> predicate =   p -> p<10;
        System.out.println(predicate.test(5));
    }
}
