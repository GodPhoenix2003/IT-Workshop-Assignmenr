import java.util.*;
public class Prog13 {
    public static void main(String []args){
        Item obj = new Item();
        obj._input_();
        obj._display_();
    }
}

class Item{
    int code, price;
    Item[] I = new Item[5];
    public Item(){}
    public Item(int code, int price){
        this.code = code;
        this.price  = price;
    }
    public void _input_(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the data:");
        for(int  i =0; i<5; i++){
            System.out.println("Item " + (i+1) + ":-");
            System.out.print("Code: ");
            int code = in.nextInt();
            System.out.print("Price: ");
            int price = in.nextInt();
            I[i] = new Item(code, price);
        }
        in.close();
    }
    public void _display_(){
        int tot = 0;
        System.out.println("Item Code\tItem Price");
        System.out.println("--------------------------");
        for(int i = 0; i<5; i++){
            System.out.println("   " + I[i].code + "\t      \t" + I[i].price);
            tot += I[i].price;
        }
        System.out.println("Total Price of all items is: " + tot);
    }
}
