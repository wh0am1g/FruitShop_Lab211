package P0023;

import java.util.ArrayList;

public class FruitShop {
    ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
    
    void add(Fruit item){
        fruitList.add(item);
    }
    Fruit get(int index){
        return fruitList.get(index);
    } 
    int size(){
        return fruitList.size();
    }
    boolean checkIdExist(String id){
        for(Fruit fruit: fruitList){
            if (fruit.getId().equals(id)) return true;
        }
        return false;
    }
    void displayById(String id){
        for(Fruit fruit: fruitList){
            if (fruit.getId().equals(id)) {
                System.out.println("| ++ ID ++ | ++ Fruit name ++ | ++ Origin ++ | ++ Price ++ | ++ Quantity ++ |");
                String tg="";
                while (tg.length()<=70){
                    if (tg.length()==4) tg=tg+fruit.getId();
                    if (tg.length()==16) tg=tg+fruit.getName();
                    if (tg.length()==34) tg=tg+fruit.getOrigin();
                    if (tg.length()==52) tg=tg+fruit.getPrice()+"$";
                    if (tg.length()==65) tg=tg+=fruit.getQuantity();
                    tg=tg+" ";
                }
                System.out.println(tg);
            };
        }
    }
    void addQuantity(String id, int quantity){
        for(Fruit fruit: fruitList){
            if (fruit.getId().equals(id)) {
                fruit.setQuantity(fruit.getQuantity()+quantity);
            }
        }
    }
    void display(){
        String tg="| ++ Item ++ | ++ Fruit name ++ | ++ Origin ++ | ++ Price ++ | ++ Quantity ++ |";
        System.out.println(tg);
        for(int i=0;i<fruitList.size();i++){

            fruitList.get(i).printFruit(i+1);
        }
        
    }
    
}
