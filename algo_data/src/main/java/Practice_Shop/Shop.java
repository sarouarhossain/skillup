package Practice_Shop;

import java.util.List;

public class Shop implements Display{
    private String location;
    private String name;
    private ContactInfo contactInfo;
    private List<Item> itemList;

    @Override
    public void display(){
        for (Item item: itemList){
            System.out.println(" itemId: "+item.getItemId()+", name: "+item.getName()+", price: "+item.getPrice()+" quantity: "+item.getQuantity());
        }
    }

    public Item getItemById(String id){
        for (Item item: itemList){
            if(item.getItemId() == id){
                return item;
            }
        }
        return null;
    }

    public void addItem(Item item){
        this.itemList.add(item);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
