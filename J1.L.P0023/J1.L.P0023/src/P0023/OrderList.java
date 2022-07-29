package P0023;

import java.util.ArrayList;
import java.util.Hashtable;

public class OrderList {
    Hashtable<String, ArrayList<Order> > order = new Hashtable<String, ArrayList<Order> >();
    
    void put(String name, Order list){
//        order.put(name,list);
        ArrayList<Order> temp = new ArrayList<Order>();
        temp.add(list);
        if (order.containsKey(name)) order.get(name).add(list);
        else order.put(name,temp);
    }
    
    void display(){
        order.forEach((name, list)->{
            System.out.println("Customer: "+name);
            for(Order order:list) order.display();
            System.out.println();
        });
    }
     
}
