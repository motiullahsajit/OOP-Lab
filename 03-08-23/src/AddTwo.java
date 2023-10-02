import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args){
        int num, f, s, t, l;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        f = num/1000;
        l = num%10;
        num = (num%1000);
        s = num/100;
        t = (num%100)/10;
        f = f + 2;
        s = s +  2;
        t = ((t+2)>10)?((t+2)%10):(t+2);
        l = l +2;
        System.out.println(+f +"" + s +""+ t + ""+ l ); 
    }
}
