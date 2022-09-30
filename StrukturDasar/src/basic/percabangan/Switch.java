package basic.percabangan;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka 1 s/d 5");
        int angka = input.nextInt();
        String message="";
        switch(angka){
            case 1:
                message = "Anda memasukkan angka 1";
                break;
            case 2:
                message = "Anda memasukkan angka 2";
                break;
            case 3:
                message = "Anda memasukkan angka 3";
                break;
            case 4:
                message = "Anda memasukkan angka 4";
                break;
            case 5:
                message = "Anda memasukkan angka 5";
                break;
            default:
                message = "Anda memasukkan angka selain 1 - 5";
                break;
        }
        System.out.println(message);
    }
}
