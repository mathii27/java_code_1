import java.util.*;
public class generic_sum_odd_and_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer[] arr1 = new Integer[size];
        for(int i=0; i<size; i++){
            arr1[i] = sc.nextInt();
        }
        sum(arr1);
    }
    public static <t extends Number> void sum(t[] arr){

        int even_sum = Arrays.stream(arr).mapToInt(Number::intValue).filter(num->num%2==0).sum();
        int odd_sum = Arrays.stream(arr).mapToInt(Number::intValue).filter(num->num%2!=0).sum();
        System.out.println("the sum of even numbers is :"+even_sum);
        System.out.println("the sum of odd numbers is :"+odd_sum);
    }
}
