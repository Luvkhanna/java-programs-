package leetbinary;

import java.util.Scanner;
public class ceiling {
//         celing of number basically return the smallest number which is greater than or equal to target element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array element : ");
        int[] arr = new int[7];
        for ( int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the target : ");
        int target = sc.nextInt();

        int ans = ceilingnumber(arr , target);
        System.out.println(ans);
    }

    static int ceilingnumber(int[] arr, int target){

        if (target > arr[arr.length -1]) return - 1;

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
//             find the middle number
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid ;
            }
        }

        return start;
    }

}
