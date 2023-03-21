package homework_projects;

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        System.out.println("Enter any Alphabet A to F: ");
        Scanner scan = new Scanner(System.in);              //scanner calling
        char User = scan.next().charAt(0);                  // char defining
        switch (User) {                                     //Switch statement

            case 'A':
                System.out.println("Aberden");
                break;
            case 'B':
                System.out.println("Bath");
            case 'C':
                System.out.println("Cambridge");
            case 'D':
                System.out.println("Derby");
            case 'E':
                System.out.println("Exeter");
                break;
            case 'F':
                System.out.println("Fair Oak");
                break;
                default:
                System.out.println("Invalid input");
                scan.close();

        }
    }

}
