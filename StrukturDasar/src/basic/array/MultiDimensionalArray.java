package basic.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

        // Dimensi 1 yang indeksnya 0 memiliki panjang elemen 2
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';

        // Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';

        System.out.println("Tampilkan semua data dari dimensi 1 yang indeksnya 0");
        System.out.println(arrChar[0][0]);
        System.out.println(arrChar[0][1]);

        System.out.println("Tampilkan semua data dari dimensi 1 yang indeksnya 1");
        System.out.println(arrChar[1][0]);
        System.out.println(arrChar[1][1]);
        System.out.println(arrChar[1][2]);

    }
}
