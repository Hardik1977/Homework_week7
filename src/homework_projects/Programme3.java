package homework_projects;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Programme3 {

    public static void main(String[] args) {
        //variable declaration
        String name;
        String nameone;
        int mark1;
        int mark2;
        int mark3;
        int total;
        int percentage;
        //double average;

        //input 3 scores as per requirements
        Scanner input = new Scanner(System.in);  //// Scanner calling
        System.out.println("Enter your name : ");
        name = input.nextLine();//this stores the input from the student
        System.out.println("Enter student roll no :/n ");
        nameone = input.nextLine();//this stores the roll no. for student
        System.out.println("Enter score for the subject Maths: ");  //user input for scores
        mark1 = input.nextInt();
        System.out.println("Enter score for the subject Science: ");
        mark2 = input.nextInt();
        System.out.println("Enter score for the subject English: ");
        mark3 = input.nextInt();
        total = mark1 + mark2 + mark3; // variable defining
        percentage = total / 3;


        input.close();

        //Calculation to find total, percentage, result and invalid input

        System.out.println("_______________________________");
        System.out.println("|                              |");
        System.out.println("|          Mark Sheet          |");
        System.out.println("|______________________________|");
        System.out.println("| Name     :            " + name);
        System.out.println("| Roll No  :            " + nameone);
        System.out.println("|______________________________|");
        System.out.println("| Subjects :              Marks|");
        System.out.println("|______________________________|");
        System.out.println("| Math     :          " + mark1);
        System.out.println("| Since    :          " + mark2);
        System.out.println("| Math     :          " + mark3);
        System.out.println("| Total    :          " + total);
        System.out.println("|                              |");
        System.out.println("|______________________________|");
        System.out.println("| Percentage:    " + percentage);
        if (percentage < 35) {                                  // if and else if condition
        System.out.println("| Result :                 Pass|");
        } else if (percentage <35 ) {
        System.out.println("| Result :                 Fail|");
        } else if (percentage >= 80 && percentage <=100) {
        System.out.println("| Grade :                    +A|");
        } else if (percentage >= 60 && percentage <=79) {
        System.out.println("| Grade :                     A|");
        } else if (percentage >= 50 && percentage <=59) {
        System.out.println("| Grade :                     B|");
        } else if (percentage >= 35 && percentage <=50) {
        System.out.println("| Grade :                     C|");
        System.out.println("|______________________________|");
        } else if (mark1 > 100 && mark2 > 100 && mark3 > 100) {
        System.out.println("invalid input");
        } else if (mark1 <= 0 && mark2 <= 0 && mark3 <= 0) {
        System.out.println("invalid input");
        }
    }
}








