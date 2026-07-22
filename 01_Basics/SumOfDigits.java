import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int digit = 0;
        while(n > 0){
            int i = n % 10;
            digit += i;
            n=n/10;
        }
    
        System.out.println("sum of number:" + digit);
    }
}