package leetbinary;
import java.util.Scanner;
public class floornumber {

//     floor number basically return the greatest number smaller than or equal to the target number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array element : ");
        int[] arr = new int[7];
        for ( int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the target : ");
        int target = sc.nextInt();

        int ans = floorNumber(arr , target);
        System.out.println(ans);
    }

    static int floorNumber(int[] arr, int target){
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

        return end;
    }

}
