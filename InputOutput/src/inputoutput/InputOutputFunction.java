package inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Penjumlahan 2 buah angka");
        System.out.print("Masukkan angka pertama: ");
        int value1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int value2 = input.nextInt();

        int result = value1 + value2;
        System.out.println("Hasil penjumlahan antara " + value1 + " dan " + value2 + " adalah " + result);


    }
}
