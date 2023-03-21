package homework_projects;

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {  // main method
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");   //User inputs
        int a = scanner.nextInt();
        System.out.println("Enter second number:  ");
        int b = scanner.nextInt();
        System.out.println("Enter one symbol from (+ - * / ) for operation:  "); // User enter operator
        char symbol = scanner.next().charAt(0);
        Programme10 obj = new Programme10();
        obj.operation(a, b, symbol);
    }
        //Calculating operation based on symbol using method
    public void operation(int a, int b, char symbol){
    if (symbol == '+') {              // if and else if condition
        System.out.println("Addition is " + (a+b));
        } else if (symbol == '-') {
        System.out.println("Substraction is " + (a-b));
        } else if (symbol == '*') {
        System.out.println("Multiplication is  " + (a*b));
        } else if (symbol == '/') {
        System.out.println("Division is  " + (a/b));
        } else {
            System.out.println("Invalid operator symbol.");  //in case of invalid input

        }


    }

}
