package Java8FeaturesLearn.LambdaFeaturesLearn;

public class SameClassInterfaceLEarn {

    interface LEarnInterfaceOne {
        void method();
    }

    interface LearnInterfaceTwo {
        void method2(int a, int b);
    }

    public static void main(String args[]) {
        LEarnInterfaceOne learnInterface = () -> System.out.println("Interface Access");
        learnInterface.method();
        LearnInterfaceTwo learnInterfaceTwo = (int a, int b) -> System.out.println(a * b);
        learnInterfaceTwo.method2(10, 50);

    }
}
