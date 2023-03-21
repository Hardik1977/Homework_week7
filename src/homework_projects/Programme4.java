package homework_projects;

/**
 * 4. Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 */
public class Programme4 {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println("____________________________________________");
        //5 outputs to get days in a month
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
        //static method for leap year
        public static boolean isLeapYear (int year){  // Static method defining
            boolean b;
            if (year <= 1 || year >= 9999) {  // if condition
                b = false;
            } else {
                b = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
            }
            return b;
        }

        //static method for month and days

        public static int getDaysInMonth (int month, int year){

            int days = 0;
            if (month < 1 || month > 12) {
                return -1;
            }
            if (year < 1 || year > 9999) {
                return -1;
            }
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                           }
            return days;
        }

    }



