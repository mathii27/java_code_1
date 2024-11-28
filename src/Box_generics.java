import java.util.*;
class box<t>{
    t input;
    public void setinput(t input){
        this.input = input;
    }
    public void getinput(){
        System.out.println(input);
    }
}
public class Box_generics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        box<Integer> obj = new box();
        box<String> obj1 = new box();
        String str = sc.nextLine();
        int num = sc.nextInt();
        obj1.setinput(str);
        obj1.getinput();
        obj.setinput(num);
        obj.getinput();

    }
}
