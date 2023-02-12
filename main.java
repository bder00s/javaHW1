

public class main {
    public static void main(String[] args) {

        int number = 6;
        int number2 = 0;
        int input1 = 4;
        int input2 = 20;
        String name = "Ollie";
        String kittyName = "Prinses";

        hello();

        positiveOrNegative(number);

        positiveZeroOrNegative(number2);

        bartender(name);

        sum(input1, input2);

        kitty(kittyName);
    }

    public static void hello() {
        System.out.println("Hello world");
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number < 0) {
            System.out.println("This number is negative!");
        } else {
            System.out.println("This number is zero");
        }
    }

    public static void bartender(String name) {
        switch (name) {
            case "Willy":
                System.out.println("Willy drinkt graag sinasappelsap");
                break;
            case "Geest":
                System.out.println("Geest drinkt graag een glaasje afwasmiddel");
                break;
            case "Ollie":
                System.out.println("Ollie drinkt graag een schaaltje melk");
                break;
            default:
                System.out.println("Deze persoon bestaat niet");
        }
    }

    public static void sum(int input1, int input2) {
        int answer = input1 + input2;
        System.out.println("The sum of this numbers is " + answer);
    }

    public static void kitty(String catName) {
        switch (catName) {
            case "Louis":
                System.out.println("Louis is donkerrood, houdt van thee en is onvoorspelbaar");
                break;
            case "Loetje":
                System.out.println("Loetje is rood met wit gevlekt, heel nieuwsgierig en nog jong");
                break;
            case "Luzensky":
                System.out.println("Luzensky is licht-rood en wit gevlekt, dol op theezakjes, nieuwsgierig en makkelijk");
                break;
            case "Prinses":
                System.out.println("Prinses is rood met wit gevlekt en heeft een wollige vacht. Ze is lief en elegant");
                break;
            default:
                System.out.println("Geen kat gekozen");
        }
    }


}
