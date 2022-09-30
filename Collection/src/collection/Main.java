package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "Superman";
        heroes[1] = "Spidermane";
//        heroes[2] = "Wonderwomen"; ini mengakibatkan error, karena kapasitas array hanya 2
        for(int i=0; i<heroes.length;i++){
            System.out.println(heroes[i]);
        }

    }
}
