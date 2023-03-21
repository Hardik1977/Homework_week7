package homework_projects;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7 {

    public static void main(String[] args) {
    int grossSalary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller's name : ");
        String name = scanner.nextLine();
        System.out.println("Enter sales ID :      ");
        int id = scanner.nextInt();
        System.out.println("Enter sales amount :  ");
        int amount = scanner.nextInt();
        System.out.println("Enter basic salary :  ");
        int basic = scanner.nextInt();

        //creating object to call method

        Programme7 obj = new Programme7();  // object difining
        grossSalary = obj.calculateCommission(amount)+ basic; // method calling through obj
        System.out.println("Seller's name is : " + name);
        System.out.println("Seller's ID is : " + id);
        System.out.println("Seller's sales amount is : " + amount);
        System.out.println("Seller's basic amount is :" + basic);
        System.out.println("Seller's gross salary is :" + grossSalary);
        scanner.close(); // scanner closing
    }

    public int calculateCommission(int amount) {        // method defining

        int commission;
        if (amount >= 50000) {                                          // if and else if condition
            commission = (amount * 35) / 100;                           // calculation
            System.out.println("Sales commission is :" + commission);
        } else if (amount >= 30000) {
            commission = (amount * 20) / 100;
            System.out.println("Sales commission is :" + commission);
        } else if (amount >= 20000) {
            commission = (amount * 10) / 100;
            System.out.println("Sales commission is :" + commission);
        } else if (amount >= 10000) {
            commission = (amount * 5) / 100;
            System.out.println("Sales commission is :" + commission);
        } else {
            commission = (amount * 2) / 100;
            System.out.println("sales commission is :" + commission);
        }
        return commission;


    }
}




