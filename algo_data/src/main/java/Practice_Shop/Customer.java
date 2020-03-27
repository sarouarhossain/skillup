package Practice_Shop;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Display{
    private String customerId;
    private String name;
    // composition
    private ContactInfo contactInfo;
    private List<Item> cartList = new ArrayList<>();

    @Override
    public void display(){
        for (Item item: cartList){
            System.out.println(" itemId: "+item.getItemId()+", name: "+item.getName()+", price: "+item.getPrice()+" quantity: "+item.getQuantity());
        }

        System.out.println(" Total Price: "+calculatePrice());
    }

    private double calculatePrice(){
        double total = 0;
        for (Item item:cartList){
            total += item.getPrice()*item.getQuantity();
        }

        return total;
    }

    public void addItem(Item item, int count){
        if(item!=null && (item.getQuantity()>=count)){
            Item newItem = new Item();
            newItem.setItemId(item.getItemId());
            newItem.setQuantity(count);
            newItem.setPrice(item.getPrice());
            newItem.setName(item.getName());

            item.subtractQuantity(count);
            this.cartList.add(newItem);
        }else{
            System.out.println("This item can not be added.");
        }
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Item> getCartList() {
        return cartList;
    }

    public void setCartList(List<Item> cartList) {
        this.cartList = cartList;
    }
}
