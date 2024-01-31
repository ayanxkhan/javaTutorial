public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int temp=num;
        int rem;
        int b=0;
        while(num>0)
        {
            rem=num%10;
            b=b+(rem*rem*rem);
            num=num/10;
        }
        if(temp==b)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}