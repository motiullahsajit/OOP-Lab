import java.util.Scanner;

public class Ascii {
    public static void main(String[] args){
        char c;
        Scanner scanner = new Scanner(System.in);
        c = scanner.next().charAt(0);

        if((int)c >= 97 && (int)c <=123){
            System.out.println("Lowercase\n");
        }else{
            System.out.println("Uppercase\n");
        }
    }
    
}
