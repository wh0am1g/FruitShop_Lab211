package P0023;

public class Main {
    public static void main(String[] args) {
        FruitShop shop = new FruitShop();
        OrderList list = new OrderList();
        Validator validator = new Validator();
        while(true){
            System.out.println("======FRUIT SHOP SYSTEM======");
            System.out.println("1. Create Fruit");
            System.out.println("2. View orders");
            System.out.println("3. Shopping (for buyer)");
            System.out.println("4. Exit");
            int type = validator.validateInput("Your choice: ",1,4);
            //create Fruit
            if (type == 1){
                String name,origin,id;
                int price,quantity;
                while(true){
                    System.out.print("Enter fruit's id: ");
                    id = validator.validateInputString();
                    if (shop.checkIdExist(id)){
                        shop.displayById(id);
                        quantity = validator.validateInput("Add quantity: ",0,1000000);
                        shop.addQuantity(id, quantity);
                    }
                    else{
                        System.out.print("Enter fruit's name: ");
                        name = validator.validateInputString();
                        System.out.print("Enter fruit's origin: ");
                        origin = validator.validateInputString();
                        price = validator.validateInput("Enter fruit's price: ",0,1000000);
                        quantity = validator.validateInput("Enter fruit's quantity: ",0,1000000);
                        shop.add(new Fruit(id, name, origin, price, quantity));
                    }
                    System.out.println("Fruit is added. Do you want to continue (Y/N)? ");
                    boolean select = validator.validateYN();
                    if (!select) break;
                }
            }
            // View Order
            if (type == 2) list.display();       
            
                            
            // Shopping
            if (type == 3) {
                if (shop.size()==0) {
                    System.err.println("Shop is empty");
                    continue;
                }
                Order order = new Order();
                while(true){
                    System.out.println("List of Fruit: ");
                    shop.display();
                    int item = validator.validateInput("Enter item you want: ",1,shop.size());   
                    String name = shop.get(item-1).getName();
                    int price = shop.get(item-1).getPrice();

                    System.out.println("You selected: "+name);
                    int quantity = validator.validateInput("Please input quantity you want: ",0,shop.get(item-1).getQuantity());
                    shop.get(item-1).setQuantity( shop.get(item-1).getQuantity()-quantity);    //Subtract quantity
                    
                    if (order.checkItemExist(item)){
                        order.addQuantity(item,quantity);
                    }else order.add(new Fruit(item, name,price,quantity));
                    
                    System.out.println("Do you want to order now (Y/N)?");
                    boolean select = validator.validateYN();
                    if (select) break;
                }
                //Print order
                order.display();
                System.out.print("Input your name: ");
                String userName = validator.validateInputString();
                list.put(userName, order);
            }
            
            if (type == 4) break;         
        }
    }
}
