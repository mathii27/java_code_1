import java.util.*;
public class generics_check_same_array extends generics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer[] arr1 = new Integer[size];
        Integer[] arr2 = new Integer[size];
        //String[] arr2 = new String[size];
        for(int i=0; i<size; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            arr2[i] = sc.nextInt();
            //arr2[i] = sc.next();
        }
        if(compare_type(arr1,arr2)){
            boolean ans = compare_array(arr1,arr2);
            if(ans){
                System.out.println("The elements are IN-ORDER");
            }
        else{
                System.out.println("The elements are not in order");
            }
        }
        else{
            System.out.println("The given array is not in same type");
        }

    }
}
class generics{
    public static <T> boolean compare_array(T[] arr1, T[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        return Arrays.equals(arr1,arr2);
    }
    public static <T> boolean compare_type(T[] arr1, T[] arr2){
        if(arr1.getClass().getName() == arr2.getClass().getName()){
            return true;
        }
        return false;
    }
}
