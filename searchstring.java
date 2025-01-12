package linearsearch;
import java.util.Scanner ;
public class searchstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name in which character to be searched");
            String name = sc.nextLine();
        System.out.println("enter the target of character at the string you provided");
        char target = sc.next().charAt(0);
        System.out.println(search(name, target));


    }

    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;

    }

}
