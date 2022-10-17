import java.util.Scanner;

public class CtoF {

    public static void main(String[] args) {

        double celsius;
        double fahrenheit;
        String trash;
        boolean done = false;



        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Input the celsius value:");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();

                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Your value in Fahrenheit is: " + fahrenheit);


            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid value: " + trash + " Try again.");

            }

        }while(true);
    }
}