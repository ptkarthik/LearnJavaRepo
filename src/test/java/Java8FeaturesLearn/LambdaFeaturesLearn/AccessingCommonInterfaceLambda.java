package Java8FeaturesLearn.LambdaFeaturesLearn;

public class AccessingCommonInterfaceLambda {
    LearnInterface learnInterface= () -> {System.out.println("accessing Lambda");};
    public static void main(String args[]) {

        AccessingCommonInterfaceLambda accessingCommonInterfaceLambda= new AccessingCommonInterfaceLambda();
        accessingCommonInterfaceLambda.learnInterface.common();
    }
}
