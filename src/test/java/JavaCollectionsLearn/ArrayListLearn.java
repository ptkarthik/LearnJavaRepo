package JavaCollectionsLearn;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class ArrayListLearn {
    public static void main(String args[]) {
        List<String> arrayListObject = new ArrayList<>();
        List<Object>asListObject= Arrays.asList("1","",3,"KArthik");
        arrayListObject.add(0,asListObject.toString());
        arrayListObject.add(1,"one");
        out.println(arrayListObject);
        for(String lists:arrayListObject) {

            out.println(lists);
        }

        PrivilegedAction<Double> doublePrivilegedAction = () -> { System.out.println("The run will cause");
            double v = 123.35;
            System.out.println(v);
            return  v;
        };
        doublePrivilegedAction.run();
    }
}
