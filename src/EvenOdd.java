import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.printf("%d is an even number",num);
        }
        else
        {
            System.out.printf("%d is an odd number",num);
        }
    }
}
