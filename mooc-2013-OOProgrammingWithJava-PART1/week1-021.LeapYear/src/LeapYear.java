
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        System.out.println("Type a year:");
        int leap = reader.nextInt();
        
        if (leap % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (leap % 100 != 0 && leap % 4 == 0 ) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
            
       
       
    }
}
