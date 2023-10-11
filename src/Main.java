import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //vars
        double sideOne;
        double sideTwo;
        double area;
        double perimeter;
        double diag;


        // checks side one
        do {
            System.out.println("enter side length one");

            if(scan.hasNextDouble()){
                sideOne = scan.nextDouble();
                if(sideOne > 0){
                    break;
                }
            }
            System.out.println("you have an invalid side length, please try again.");
            scan.nextLine();
        } while (true);

        // checks side two
        do {
            System.out.println("enter side length two");

            if(scan.hasNextDouble()){
                sideTwo = scan.nextDouble();
                if(sideTwo > 0) {
                    break;
                }
            }
            System.out.println("you have an invalid side length, please try again.");
            scan.nextLine();
        } while (true);
        // math
        area = sideOne * sideTwo;
        perimeter = (sideOne*2) + (sideTwo*2);
        double power = Math.pow(sideOne, 2) + Math.pow(sideTwo, 2);
        diag = Math.sqrt(power);



        // prints
        System.out.printf("%-10s %8.2f", "Side 1:", sideOne);
        System.out.printf("\n%-10s %8.2f", "Side 2", sideTwo);
        System.out.printf("\n%-10s %8.2f", "Area:", area);
        System.out.printf("\n%-10s %8.2f", "Permimeter", perimeter);
        System.out.printf("\n%-10s %8.2f", "Diagonal", diag);


    }
}