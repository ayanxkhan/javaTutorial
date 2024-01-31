import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        int rev_no=0;
        int temp=num;
        while(num>0)
        {
            rev_no=rev_no*10 + num%10;
            num=num/10;
        }
        if(rev_no==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
