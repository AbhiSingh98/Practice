import java.util.Scanner;
 
public class Application {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
         
// Use carrot as password when running tests.
     while (true) {
         System.out.println("Type the password: ");
         
         if (password.equals("carrot")) {
           
         
            System.out.println("Right!");
             System.out.println("jryy qbar!");
         }
         else {
             System.out.println("Wrong!");
         }
     }
    }
    