import java.util.Arrays;
import java.util.Scanner;
public class Reverse{
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elements:");

        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }



        //Reverse an array
        for(int i=0;i<arr.length/2;i++){
          int temp=arr[i];
          arr[i]=arr[arr.length-1-i];
          arr[arr.length-1-i] =temp;
        }

        //Print reversed array
        System.out.println("Reversed array:" + Arrays.toString(arr));
       


       }
}