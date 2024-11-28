import java.util.*;

class Products{
    String Product_name;
    int Product_quantity;
    double Product_price;
    Products(String Product_name, int Product_quantity, double Product_price){
        this.Product_name = Product_name;
        this.Product_quantity = Product_quantity;
        this.Product_price = Product_price;
    }
    public void setProduct_name(String Product_name){
        this.Product_name = Product_name;
    }
    public void setProduct_quantity(int Product_quantity){
        this.Product_quantity = Product_quantity;
    }
    public void setProduct_price(double Product_price){
        this.Product_price = Product_price;
    }

    public String getProduct_name(){
        return Product_name;
    }
    public int getProduct_quantity(){
        return Product_quantity;
    }
    public double getProduct_price(){
        return Product_price;
    }
    public String toString() {
        return "Product Name: " + Product_name + ", Quantity: " + Product_quantity + ", Price: " + Product_price;
    }
}
class inventory{
    //static Scanner sc = new Scanner(System.in);
    public static ArrayList<Products> lst = new ArrayList<>();

    /*public static int list(){
        System.out.println("Please Select from the below list: \n1.Add-Products \n2.Remove-Products \n3.Display-Products \n4.Total Inventory value \n5.Exit");
        int num = sc.nextInt();
        return num;
    }*/

    public static void add_products(String str, int quantity, double price){
        Products prod = new Products(str, quantity, price);
        if(check_products(str)){
            update_products(str,quantity);
        }
        else {
            lst.add(prod);
        }
        System.out.println("Products added successfully");
    }
    public static boolean check_products(String name){
        for(Products prod : lst){
            if(prod.getProduct_name().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    public static void update_products(String name, int quantity){
        for(Products prod : lst){
            if(prod.getProduct_name().equalsIgnoreCase(name)){
                int new_quant = prod.getProduct_quantity()+quantity;
                prod.setProduct_quantity(new_quant);
            }
        }
    }
    public static void remove_products(String name){
            int flag = 0;
            for(int i = lst.size() - 1; i >= 0; i--) {
                if ((lst.get(i).getProduct_name()).equalsIgnoreCase(name)) {
                    lst.remove(i);
                    flag = 1;
                }
            }
            if(flag == 1){
                System.out.println("Product removed !!");
            }
            else{
                System.out.println("Product not available");
            }
    }
    public static void display(){
        if(lst.isEmpty()){
            System.out.println("The Products list is empty");
        }
        else {
            for (Products prod : lst) {
                System.out.println(prod + " ");
            }
        }
        System.out.println();
    }
    public static int total(){
        int total = 0;
        for(Products prod : lst){
            total += (prod.getProduct_quantity()*prod.getProduct_price());
        }
        return total;
    }
}
public class inventory_managment extends inventory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Inventory Management system");
        while(true) {
            System.out.println("Please Select from the below list: \n1.Add-Products \n2.Update-Quantity Product \n3.Remove-Products \n4.Display-Products \n5.Total Inventory value \n6.Exit");
            int num = sc.nextInt();
            if(num == 6){
                System.out.println("Thank you!!");
                break;
            }
            switch (num) {
                case 1:
                    System.out.println("Enter the Product: ");
                    String name = sc.next();
                    System.out.println("Enter the Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.println("Enter the Price: ");
                    double price = sc.nextDouble();
                    add_products(name, quantity, price);
                    break;
                case 2:
                    System.out.println("Enter the Product: ");
                    name = sc.next();
                    System.out.println("Enter the Quantity: ");
                    quantity = sc.nextInt();
                    update_products(name,quantity);
                    break;
                case 3:
                    System.out.println("Enter the product you want to remove");
                    String str = sc.next();
                    remove_products(str);
                    break;
                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("The total value of inventory is: "+ total());
                    System.out.println();
                    break;
                case 6:
                    break;

                default:
                    System.out.println("No such options available!!");
            }
        }
    }
}
