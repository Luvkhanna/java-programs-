package leetbinary;
import java.util.Scanner;
public class leet744 {
   //     find the smallest letter greater than the target
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the letters : ");
       char[] letters = new char[5];
       for (int i = 0; i <letters.length; i++){
           letters[i] = sc.next().charAt(0);
       }
       System.out.println("enter the target : ");
       char target = sc.next().charAt(0);

       char ans = binarysearch(letters , target);
       System.out.println(ans);

   }

   static  char binarysearch (char[] letters , char target){
           int start = 0;
           int end = letters.length -1;

           while(start <= end ){
               int mid = start + (end - start) /2;
               if(target < letters[mid]){
                   end =  mid - 1;

               }else{
                   start = mid + 1 ;
               }
           }

           return letters[start % letters.length];

   }

}
