package homework_projects;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         //import scanner
        System.out.println("Enter a value:     ");        //user input
        String input = scanner.next();
        if(input.matches("[0-9]+")){               //condition apply
            System.out.println("input is number.  ");   // print statement
            }
        else if(input.matches("[a-z A-z]+")){       //condition apply
            System.out.println("input is alphabet.  ");  //print statement
        }


    }



}
