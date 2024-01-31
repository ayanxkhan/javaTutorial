import java.util.Scanner;
public class multiplication_table{

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any number you want multiplication table of:");
            int num=sc.nextInt();
            for(int i=1;i<11;i++)
            {
                System.out.printf("%d X %d = %d\n",num,i,num*i);
            }

        }
    }
