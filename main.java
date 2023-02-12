

public class main {
    public static void main(String[] args) {

        int number = 0;
        int input1;
        int input2;
        String name;

        hello();

        System.out.println(positiveOrNegative(number));

        System.out.println(positiveZeroOrNegative(number));



    }

    public static void hello(){
        System.out.println("Hello world");
    }

    public static String positiveOrNegative(int number){
        if (number > 0 ){
            return "This number is positive!";
        } else {
            return "This number is negative!";
        }
    }

    public static String positiveZeroOrNegative(int number) {
        if (number > 0) {
            return "This number is positive!";
        } else if (number < 0){
            return "This number is negative!";
        } else {
            return "This number is zero";
        }
    }
}
