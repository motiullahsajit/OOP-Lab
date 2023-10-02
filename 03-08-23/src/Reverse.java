import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        int num, f, s,l;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        l = num%10;
        num /= 10;
        s = num % 10;
        num /= 10;
        f = num % 10;

        System.out.println(+l+""+s+""+f);

    }
}
