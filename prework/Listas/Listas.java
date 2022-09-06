package Listas;

import java.util.List;
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
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
