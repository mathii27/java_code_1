import java.util.*;
public class fact {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int m = fact(a);
//        System.out.println(m);
//    }
    public static int factt(int a){
        int m =1;
        for(int i=1; i<=a; i++){
            m*=i;
        }
        return m;
    }
}
