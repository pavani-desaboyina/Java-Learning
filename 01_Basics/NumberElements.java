import java.util.Scanner;
public class NumberElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int c = 0;
        while (n>0){
           int digit = n%10;
            c++;
            n/=10;
        }
        System.out.println(c);
       
    }
}