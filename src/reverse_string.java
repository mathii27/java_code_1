import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int a = str.length();
        for(int i=0; i<str.length()/2; i++){
           char temp = arr[i];
           arr[i] = arr[a-1-i];
           arr[a-1-i] = temp;
        }
        String s = "";
        for(int i=0; i<arr.length; i++){
            s = s+arr[i];
        }
        System.out.println(s);
    }
}
