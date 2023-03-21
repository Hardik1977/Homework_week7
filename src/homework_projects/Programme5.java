package homework_projects;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 */
public class Programme5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner calling
        System.out.println("Enter Employee Name : ");  // user input through print statement
        String eName = scanner.nextLine();
        System.out.println("Enter employee ID : ");
        int eId = scanner.nextInt();

        System.out.println("Enter basic Salary : ");
        int eSal = scanner.nextInt();

        //Calculating HRA,DA,TA AND PF

        double hra = calculateHRA(eSal);
        double da = calculateDA(eSal);
        double ta = calculateTA(eSal);
        double pf = calculatepf(eSal);

        double grossSalary = eSal + hra + da + ta + pf;

        System.out.println("_________________________________|");
        System.out.println("| Salary Slip                    |\n");
        System.out.println("|______________________________  |\n");
        System.out.println("| Employee Id : " + eSal + "     |");
        System.out.println("| Employee Name :" + eName + "   |");
        System.out.println("|_______________________________ |\n");
        System.out.println("| Basic Salary :" + eSal + "     |");
        System.out.println("| HRA 10%     :" + hra + "       |");
        System.out.println("| TA  10%     :" + ta + "        |");
        System.out.println("| DA  9%      :" + da + "        |");
        System.out.println("| PF -20&     :" + pf + "        |");
        System.out.println("|_______________________________ |");
        System.out.println("| Gross Salary :" + grossSalary +"|");
        System.out.println("|=================================|\n");
        scanner.close();
    }

    public static double calculateHRA(double basicSalary) {

        return (basicSalary * 10 / 100);//HRA CALCS
    }

    public static double calculateTA(double basicSalary) {
        return (basicSalary * 8 / 100);// TA CALCS
    }

    public static double calculateDA(double basicSalary) {
        return (basicSalary * 8 / 100);// DA CALCS
    }
    public static double calculatepf(double basicSalary) {
        return (basicSalary * 20/100); // PF CALCS
    }


}
