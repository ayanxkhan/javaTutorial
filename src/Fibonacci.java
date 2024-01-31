public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int fib=0;
        System.out.println("Fibonacci Series:");
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<9;i++)
        {
            fib=a+b;
            System.out.println(fib);
            a=b;
            b=fib;
        }
    }
}
