package chapter4;

import java.util.Scanner;

public class add_number {
    public static void  main (String args[]){
        Scanner scanner = new Scanner(System.in);

        boolean again = false;

        do{
            System.out.println("Enter num 1");
            double num1 =scanner.nextInt();

            System.out.println("Enter num 2");
            double num2 =scanner.nextInt();

            double sum = num1 + num2 ;

            System.out.println(sum);

            System.out.println("Do u want start again?");
            again = scanner.nextBoolean();



        }while(again);
        scanner.close();
    }
}
