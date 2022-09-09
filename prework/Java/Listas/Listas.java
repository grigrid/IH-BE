package Java.Listas;

import java.util.List;
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Dario", 3139295));
        contactList.add(new Contact("Omar", 4100747));
        
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i).getName());
        }
        
        
        
        List<String> cars = new ArrayList<>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Porsche");
        
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        
        cars.remove(2);
        for (int i=0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
        }
        }
}
