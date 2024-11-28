import java.util.*;
public class merge_two_sorted_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        for(int i=0; i<a; i++){
            arr1[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int[] arr2 = new int[a];
        for(int i=0; i<a; i++){
            arr2[i] = sc.nextInt();
        }
        List<Integer> tot = new ArrayList<>();
        int len = a>b ? a:b;
        for(int i=0; i<len; i++){
            if(arr1[i] <= arr2[i]){
                tot.add(arr1[i]);
                tot.add(arr2[i]);
            }
            else{
                tot.add(arr2[i]);
                tot.add(arr1[i]);
            }
        }
        System.out.println(tot);
    }
}
