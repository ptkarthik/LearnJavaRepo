package JavaCollectionsLearn;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLearn {

    public static void main(String args[]) {
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("Major");
        hashSet.add("major");
        hashSet.add("MaJor");
        System.out.println(hashSet);

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String data:hashSet){
            System.out.println(data);
        }
    }
}
