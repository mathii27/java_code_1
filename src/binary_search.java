import java.util.*;
public class binary_search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{93,26,44,59,64};
        int find = 59;
        Arrays.sort(arr);
        int sol = ans(arr,0,arr.length-1,find);
        if(sol != -1){
            System.out.println("element found at index "+sol);
        }
        else{
            System.out.println("element not found");
        }
    }
    public static int ans(int[] arr,int low,int high,int find){
        while(low < high){
            int mid = (low+high)/2;
            if(arr[mid] < find){
                low = mid+1;
            }
            else if(arr[mid] > find) {
                high = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
