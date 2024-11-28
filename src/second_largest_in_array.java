import java.util.*;
public class second_largest_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{34,47,53,64,75};
        int max1=0, max2=0;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            if(max1<=arr[i]){
                max2= max1;
                max1= arr[i];
            }
        }
        System.out.println("second largest - "+max2);
        System.out.println("first largest - "+max1);
    }
}
