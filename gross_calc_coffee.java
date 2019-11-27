package chapter4;

import java.util.Scanner;

public class gross_calc_coffee {
    public static  void main (String  args[]){
        int maxhours =40;
        int rate = 15;

        System.out.println("Enter the hours worked?");
        Scanner scanner = new Scanner(System.in);
        double hourswrked = scanner.nextDouble();

        while ( (hourswrked >= maxhours)  || ( hourswrked <= 1)){
            System.out.println("Invalid entry");
            hourswrked = scanner.nextDouble();
        }

        scanner.close();

        double gorss = hourswrked * rate;
        System.out.println(gorss);
    }

}
