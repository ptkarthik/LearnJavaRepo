package JavaCollectionsLearn;

import java.util.*;

public class HashMapLearn extends Object{

    public static void main(String args[]) {

HashMapLearn hashMapLearn = new HashMapLearn();

/**
 *  to access the below webtable
 *  name destination empid
 *  karthik SA 433831
 *  Eswari SA 123456
 *  Praveen A 23332
 */
        List<String> k=null;
Map<String, List<String>> hasMapData= new HashMap<>();
hasMapData.put("Name",Arrays.asList("Karthik","Eswari","Praveen"));
hasMapData.put("Destination",Arrays.asList("SA","SA","A"));
String student="Student";
String vaule="Karthik";
System.out.printf("The name of %s is %s",student,vaule);


Set <String> keySetData= hasMapData.keySet();



        for(String Key:keySetData) {
            hasMapData.get(Key);
            System.out.println(hasMapData);
        }

}


//System.out.println(hasMapData);
    }

