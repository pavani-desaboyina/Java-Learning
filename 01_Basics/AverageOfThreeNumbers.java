import java.util.Scanner;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter three numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int average = (a+b+c)/3;
    System.out.println("average of numbers:" + average);
}
}