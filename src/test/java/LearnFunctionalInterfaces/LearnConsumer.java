package LearnFunctionalInterfaces;

import java.util.function.Consumer;

public class LearnConsumer {

    public static void main(String args[]) {
        Consumer<String> stringConsumer= (p)->System.out.println(p+""+"  "+"Thangavel");
        Consumer<String> stringConsumer1= (p)->System.out.println(p.toLowerCase());
        stringConsumer.andThen(stringConsumer1).accept("Karthik");
    }
}
