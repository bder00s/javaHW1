

public class main {
    public static void main(String[] args) {

        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Ollie";

        hello();

        System.out.println(positiveOrNegative(number));

        System.out.println(positiveZeroOrNegative(number));

        bartender(name);

        System.out.println(sum(input1, input2));

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

    public static void bartender(String name){
        switch (name) {
            case "Willy" :
                System.out.println("Willy drinkt graag sinasappelsap");
                break;
            case "Geest" :
                System.out.println("Geest drinkt graag een glaasje afwasmiddel");
                break;
            case "Ollie" :
                System.out.println("Ollie drinkt graag een schaaltje melk");
                break;
            default:
                System.out.println("Deze persoon bestaat niet");
        }
    }

    public static int sum(int input1, int input2) {
        return input1 + input2;
    }





}
