import java.util.Scanner;

public class Intrests{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("principal,rate,time");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int si = p*r*t/100;
        System.out.println("simpleIntrest:"+si);
    }
}