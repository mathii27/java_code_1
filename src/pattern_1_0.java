import java.util.*;
public class pattern_1_0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            if(i%2==0) {
                for (int j = 0; j < i; j++) {
                    if(j%2==0){
                        System.out.print("0"+" ");
                    }
                    else{
                        System.out.print("1"+" ");
                    }
                }
            }
            else{
                for (int j = 0; j < i; j++) {
                    if(j%2!=0){
                        System.out.print("0"+" ");
                    }
                    else{
                        System.out.print("1"+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
