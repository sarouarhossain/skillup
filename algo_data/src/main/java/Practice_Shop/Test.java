package Practice_Shop;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] a){
        Shop shop1 = new Shop();
        shop1.setName("Agora");
        shop1.setLocation("Gazipur");
        ContactInfo shopContactInfo = new ContactInfo();
        shopContactInfo.setCell("0188888888");
        shopContactInfo.setEmail("agora.gazipur@gmail.com");
        shop1.setContactInfo(shopContactInfo);
        Item item1 = new Item();
        item1.setItemId("1");
        item1.setName("Lux Soap");
        item1.setPrice(20);
        item1.setQuantity(10);

        Item item2 = new Item();
        item2.setItemId("2");
        item2.setName("Rice 1kg");
        item2.setQuantity(5);
        item2.setPrice(40);

        List<Item> shop1ItemList = new ArrayList<>();
        shop1ItemList.add(item1);
        shop1ItemList.add(item2);

        shop1.setItemList(shop1ItemList);

        Item item3 = new Item();
        item3.setItemId("3");
        item3.setName("Apple");
        item3.setPrice(12);
        item3.setQuantity(100);
        shop1.addItem(item3);

        shop1.display();

        Customer customer1 = new Customer();
        customer1.setName("Rahim");
        customer1.setCustomerId("1");
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setCell("0199999999");
        contactInfo.setEmail("rahim@gmail.com");
        customer1.setContactInfo(contactInfo);

        String itemId1 = "1";
        int itemId1Count = 2;
        String itemId2 = "2";
        int itemId2Count = 1;

        Item itemOfId1 = shop1.getItemById(itemId1);
        customer1.addItem(itemOfId1,itemId1Count);

        Item itemOfId2 = shop1.getItemById(itemId2);
        customer1.addItem(itemOfId2,itemId2Count);

        System.out.println();
        System.out.println();
        customer1.display();

        System.out.println();
        System.out.println();
        shop1.display();


    }
}
