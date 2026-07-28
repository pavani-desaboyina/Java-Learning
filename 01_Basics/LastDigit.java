import java.util.Scanner;
public class NumberElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        while (n>0){
            int last = n%10;

            System.out.println("Last digit: " + last);
            n = n/10;
        }
    }
}

