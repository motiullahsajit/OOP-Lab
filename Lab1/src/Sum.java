import java.util.Scanner;
public class Sum {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
        int number = scanner.nextInt();
        int d1 = number/10000;
        int d2 = (number/10)%10;

        int sum = d1+d2;
        
        System.out.println("Sum:"+sum);
	}

}
