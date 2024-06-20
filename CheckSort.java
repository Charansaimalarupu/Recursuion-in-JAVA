import java.io.*;
import java.util.Scanner;
public class CheckSort {
    public static boolean issort(int arr[],int index){
        if (index>=arr.length){
            System.err.println(index);
            return true;
        }
        if (arr[index-1]<arr[index]){
            System.err.println("the index is"+index);
            return issort(arr,index+1);
        }
        else{
            return false;
        }
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean k=issort(arr,1);
        System.out.println("the given array is "+k);
    }
}
    
