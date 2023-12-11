package LearnFunctionalInterfaces;

import java.util.function.Function;

public class LearnFunction {

    public static void main(String args[]) {

        Function<String,Integer> functionalInterface;

        functionalInterface=p->p.length();

        System.out.println(functionalInterface.apply("Ajith"));

    }
}
