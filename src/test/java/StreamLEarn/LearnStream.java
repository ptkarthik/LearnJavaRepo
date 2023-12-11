package StreamLEarn;

import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LearnStream {

    public static void main(String args[]) {
        Consumer<Integer> cons = p->System.out.println(p+10);

        List<Integer> listOfIntegers= new ArrayList<>(Arrays.asList(20,30,40,50));
        listOfIntegers.stream().forEach(cons);
    }
}
