import java.util.Scanner;

public class StringAdd {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string 1: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter a string 2: ");
        String input2 = scanner.nextLine();
        
        System.out.println(input1+input2);
        
        scanner.close();
    }
}
