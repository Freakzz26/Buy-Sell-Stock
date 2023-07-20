import java.util.Scanner;

public class BuySell {
    static void StockCheck(int arr[],int n)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int val=0;
        for (int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
                val=i;
            }
        }
        for (int i=val;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max-min);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        StockCheck(array,n);
    }
}
