package collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanets {
    public static void main(String[] args) {
        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("Mercurius");
        planets.add("Venus");
        planets.add("Bumi");
        planets.add("Mars");

        System.out.println("MENGGUNAKAN FOREACH");
        for (String planet : planets) {
            System.out.println(planet);
        }

        System.out.println("MENGGUNAKAN FOR");
        for(int i=0; i<planets.size();i++){
            System.out.println(planets.get(i));
        }
    }
}
