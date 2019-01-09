
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number:");
        int num = Integer.parseInt(reader.nextLine());
        
        int numb = num + number;
        
        System.out.println("Sum of the numbers:" + numb);
    }
}
