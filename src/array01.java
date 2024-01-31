import java.util.Scanner;

public class array01 {
    public static void main(String[] args) {
        int n;
        int arr[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store:");
        n=sc.nextInt();

        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("The elements of array are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}


//public class practice {
//    public static void main(String[] args) {
//        int arr[]={12,3,5,10,8};
//        int sum=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            sum=sum+ arr[i];
//        }
//        System.out.println("Sum="+sum);
//    }
//}