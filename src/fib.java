import java.util.*;
public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second+" ");
        int ans = first+second;
        for(int i=2; i<a; i++){
            second = first;
            first = ans;
            ans = first+second;
            System.out.print(ans+" ");
        }

    }
}
