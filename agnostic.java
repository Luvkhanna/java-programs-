package binarysearch;
import java.util.Scanner;
public class agnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array element : ");
        int[] arr = new int [8];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("enter the target :");
        int target = sc.nextInt();
        int ans = agnosticSearch(arr , target);
        System.out.println(ans);

    }

    static  int agnosticSearch(int[] arr , int target){
     int start = 0;
     int end = arr.length - 1 ;

     boolean isAsc = arr[start] < arr[end];
        while(start<=end){
//            find the middle element
//            int mid = (start + end )/2  might be possible the start + end things we are ding exceed the range of integer in java
            int mid = start + (end - start) / 2;


            if(arr[mid]== target){
                return mid;
            }
         if(isAsc){

             if(target < arr[mid]){
                 end = mid -1;
             }
             else {
                 start = mid + 1;
             }
         }
         else{

             if(target > arr[mid]){
                 end = mid -1;
             }
             else {
                 start = mid + 1;
             }
         }


        }
        return -1;
    }



}
