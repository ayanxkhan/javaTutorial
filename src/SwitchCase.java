import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7:");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("Today is monday");
                break;

            case 2:
                System.out.println("Today is tuesday");
                break;

            case 3:
                System.out.println("Today is wednesday");
                break;

            case 4:
                System.out.println("Today is thursday");
                break;

            case 5:
                System.out.println("Today is friday");
                break;

            case 6:
                System.out.println("Today is saturday");
                break;

            case 7:
                System.out.println("Today is sunday");
                break;

            default:
                System.out.println("Entered number is not valid");
        }
    }
}
