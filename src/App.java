import java.util.Scanner;// import the Scanner class
public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScannerObject = new Scanner(System.in);//create a new scanner object
        
        System.out.println("\nWhat's your name?");
        String userName = myScannerObject.nextLine();//scanner returns a String when you use .nextLine
        System.out.println(userName + " is a good name, I know an old school friend that bears the name.");

        int currentYear = 0;
        System.out.println("\nWhat year are we? \n enter a year within 1900 and 2999");
        while(!(currentYear > 1900 && currentYear < 2999)) {
            currentYear = myScannerObject.nextInt();//.nextInt returns int
            if (!(currentYear > 1900 && currentYear < 2999)) {
                System.out.println("you must have entered a wrong year,\n kindly reenter a year within 1900 and 2999");
            }
        }
        System.out.print("we are in year " + currentYear + ", which is");
        if (currentYear % 4 == 0) {//if year mod 4 = 0, then year is a leap year
            System.out.print(" a leap year because it's divisible by 4");
        }else {
            System.out.println("n't a leap year because it isn't a leap year");
        }
        
        System.out.println("\nWhat month are we?");
        int currentMonth = myScannerObject.nextInt();//.nextInt returns int
        

        System.out.println("\nWhat today's Day in number?");
        int currentDay = myScannerObject.nextInt();//.nextInt returns int
        System.out.println("You chose " + currentDay + "as today's day");
    }
    
}

/*** 
 * This is Amazing
 * for the scanner class: we also have: 
             .nextLine for String
             .nextInt for int
             .nextDouble for double
             .nextBoolean for boolean
             .nextByte for byte
             .nextLong
             .nextShort
 ****/
