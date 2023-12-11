package JavaCollectionsLearn;

public class LearnArrays {

    public static void main(String args[]) {
        int[] arrayDetails= new int[5];
        arrayDetails[0]=100;
        arrayDetails[4]=500;
        System.out.println(arrayDetails);

        for(Integer i: arrayDetails){
            System.out.println(i);
        }
    }
}
