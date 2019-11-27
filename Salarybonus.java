package chapter4;

import java.util.Scanner;

public class Salarybonus {

    public static  void main (String args[]){
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did associate make ?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > 10){
            salary = salary + bonus;
        }

        System.out.println("The employee pay is "+ salary);
    }
}
