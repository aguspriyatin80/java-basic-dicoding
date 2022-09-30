package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanets {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();
        planets.add("Bumi");
        planets.add("Mars");
        planets.add("Saturnus");
        planets.add("Bumi");

        System.out.println("MENGGUNAKAN FOREACH");
        for (String planet:planets) {
            System.out.println(planet);
        }

        System.out.println("MENGGUNAKAN ITERATOR");
        for(Iterator iterator = planets.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
