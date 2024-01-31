public class array00 {
    public static void main(String[] args) {
        int arr[]=new int[5];//initializing array with size
        arr[0]=12;
        arr[1]=14;
        arr[2]=15;
        arr[3]=17;
        arr[4]=13;

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Element at index "+i+ " = " +arr[i]);
        }

    }
}

