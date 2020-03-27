package Practice_Shop;

public class Item {
    private String itemId;
    private int quantity;
    private String name;
    private double price;

    public void addQuantity(int quantity){
        this.quantity+=quantity;
    }

    public void subtractQuantity(int quantity){
        if(quantity <= this.quantity){
            this.quantity-=quantity;
        }else{
            System.out.println("insufficient quantity");
        }
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
