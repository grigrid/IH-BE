package Java.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Maps {
    public static void main(String[] args) {
        List<Pet> marinasPets = new ArrayList<>();
        marinasPets.add(new Pet("Bono", 2));
        marinasPets.add(new Pet("Lorinho", 3));

        List<Pet> pablosPets = new ArrayList<>();
        pablosPets.add(new Pet("Duna", 2));

        List<Pet> dariosPets = new ArrayList<>();
        dariosPets.add(new Pet("Coco", 6));
        dariosPets.add(new Pet("Bruno", 1));

        HashMap<String, List<Pet>> petsOwners = new HashMap<>();
    
        petsOwners.put("marinas@mail.com", marinasPets);
        petsOwners.put("pablos@mail.com", pablosPets);
        petsOwners.put("darios@mail.com", dariosPets);
         
        /* -------------------------------------------- */
        // To see info of the List
        // for (int i = 0; i < marinasPets.size(); i++) {
        //     System.out.println(marinasPets.get(i).getName());
        //     System.out.println(marinasPets.get(i).getAge());
        // }
        for (Pet i : dariosPets) {
            System.out.println((i).getName());
            System.out.println((i).getAge());
        }
        /* -------------------------------------------- */
        // To see keyinfo of the HashMap
        // Version 1
        // System.out.println(petsOwners.keySet());
        // Version 2
        // for (String i : petsOwners.keySet()) {
            //     System.out.println(i);
            // }
        /* -------------------------------------------- */
        // To see the details of each key
        // for (String i : petsOwners.keySet()) {
		//     System.out.println(i+"--->"+ petsOwners.get(i));
	    // }

    }
    
}
