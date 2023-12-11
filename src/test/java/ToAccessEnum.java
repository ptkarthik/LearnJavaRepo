public class ToAccessEnum {

    public static void main(String args[]) {
        LearnEnum learnEnum= LearnEnum.EAT;
        LearnEnum learnEnum1=LearnEnum.valueOf("EAT");
        System.out.println(learnEnum);
        System.out.println(learnEnum1);


    }
}

