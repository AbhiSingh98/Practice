import java.lang.Math.*;
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius:");
        int radius = reader.nextInt();
        
        double circum;
        circum = radius * Math.PI * 2;
        
        System.out.println("Circumference of the circle: " + circum);
        
        
       
    }
}
