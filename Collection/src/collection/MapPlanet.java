package collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {
    public static void main(String[] args) {
        Map<String,Planets> planets = new HashMap<>();
        planets.put("key-1",new Planets("Mercury",0.06));
        planets.put("key-2",new Planets("Venus",0.82));
        planets.put("key-3",new Planets("Earth",1.00));

        System.out.println("LOOPING KEY FROM MAP"); // untuk mengetahui jumlah planet yang ditambahkan
        for(String key: planets.keySet()){ // LOOPING KEY DARI MAP
            System.out.println(key + " = " + planets.get(key));
        }

        System.out.println("LOOPING VALUE FROM");
        for(Planets planet: planets.values()){ // LOOPING VALUE DARI MAP
            System.out.println(planet);
        }

    }
}
