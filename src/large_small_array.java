import java.util.*;
public class large_small_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{95,84,76,68,23,35,34,64,81,73,65};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("small - "+arr[0]+", "+"large - "+arr[arr.length-1]);
    }
}
