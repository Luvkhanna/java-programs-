package linearsearch;
import java.util.Scanner;
public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter the array element");
        int[] nums = new int [6];

        for (int i = 0 ; i < nums.length; i++){
            nums[i]= sc.nextInt();
        }
        System.out.print("enter the target you want to search");
        int target = sc.nextInt();
        int ans = linearsearch(nums , target);
        System.out.println(ans);

    }

    static int linearsearch(int[] arr, int target){

        if(arr.length == 0) return -1;

//        runs for loops
        for (int index = 0 ; index < arr.length; index++){
//        check the element at every index if it is equal to target

            int element = arr[index];
            if (element == target){
                return index;
            }
        }
//          this line will execute if none of the above statement is executed
//        hence the target not found
        return -1;
    }

}
