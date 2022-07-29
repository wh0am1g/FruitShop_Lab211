package P0023;

import java.util.ArrayList;


public class Order {
    ArrayList<Fruit> order = new ArrayList<Fruit>();
    void add(Fruit item){
        order.add(item);
    }
    
    boolean checkItemExist(int item){
        for(Fruit fruit: order)
        if (fruit.getItem()==item) return true;
        return false;
    }
    void addQuantity(int item, int quantity){
        for(Fruit fruit: order)
        if (fruit.getItem()==item) {
            fruit.setQuantity(fruit.getQuantity()+quantity);
        };
    }
    void display(){
        System.out.println("Product | Quantity | Price | Amount");
        int total = 0;
        for(int i=0;i<order.size();i++){
            String tg="";
            while (tg.length()<=40){
                if (tg.length()==0) tg=tg+(i+1)+".";
                if (tg.length()==2) tg=tg+order.get(i).getName();
                if (tg.length()==13) tg=tg+order.get(i).getQuantity();
                if (tg.length()==22) tg=tg+order.get(i).getPrice()+"$";
                if (tg.length()==30) tg=tg+(order.get(i).getQuantity()*order.get(i).getPrice())+"$";
                tg=tg+" ";
            }
            total+=order.get(i).getQuantity()*order.get(i).getPrice();
            System.out.println(tg);
        }
        System.out.println("Total: " + total +"$");            
    }
}
