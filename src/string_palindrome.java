import java.util.*;
public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(palindrome(str)){
            System.out.println(str+" "+"YES");
        }
        else{
            System.out.println(str+" "+"NO");
        }
    }
    public static boolean palindrome(String str){
        int a = str.length(), flag = 1;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(a-1-i)){
                flag = 0;
                break;
            }
        }
        if(flag == 0){
            return false;
        }
        return true;
    }
}
