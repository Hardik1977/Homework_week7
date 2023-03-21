package homework_projects;

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //scanner calling
        System.out.println("User enter Alphabet from A to F :");  // user input
        char city = scanner.next().charAt(0);                     // input storing
        Programme8 obj = new Programme8();                         // object defining
        obj.printCity(city);                                       // method calling
        scanner.close();
    }

    public void printCity(char city) {

        if (city == 'A' || city == 'a') {
            System.out.println("Ahmedabad");                        // print statements
        } else if (city == 'B' || city == 'b') {
            System.out.println("Bombay");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Chattisgadh");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Delhi");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Elgin");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Faridabad");
        }else{

        }


    }
}