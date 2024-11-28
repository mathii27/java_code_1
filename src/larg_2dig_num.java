import java.util.*;
public class larg_2dig_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> lst = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str.length(); j++){
                if(i!=j) {
                    String s = "";
                    s += str.charAt(i);
                    s += str.charAt(j);
                    if ((Integer.parseInt(s)) % 2 == 0) {
                        lst.add(s);
                    }
                }
            }
        }
        Collections.sort(lst);
        System.out.println(lst.get(lst.size()-1));
    }
}
