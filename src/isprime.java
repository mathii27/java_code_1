import java.util.*;
public class isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(isprime(a)){
            System.out.println(a+" - "+"YES");
        }
        else{
            System.out.println(a+" - "+"NO");
        }
    }
    public static boolean isprime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2; i<=(int)Math.sqrt(a); i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}
