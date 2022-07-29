package P0023;

class Fruit{
    
    private String  name,origin,id;
    private int quantity,price,item;

    public Fruit( String id, String name, String origin, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.quantity=quantity;
    }
    public Fruit(int item, String name, int price, int quantity) {
        this.item=item;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }
    
    public void printFruit(int item){
        String tg="";
        
        while (tg.length()<=70){
            if (tg.length()==6) tg=tg+item;
            if (tg.length()==18) tg=tg+name;
            if (tg.length()==35) tg=tg+origin;
            if (tg.length()==52) tg=tg+price+"$";
            if (tg.length()==67) tg=tg+quantity;

            tg=tg+" ";
        }
        System.out.println(tg);
    }
}