package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        int value1 = 0;
        int value2 = 0;
        try{
            System.out.print("Masukkan angka pertama : ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan angka kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e){
            e.getStackTrace();
        }
        int result = value1 + value2;
        System.out.println("Jumlah "+ value1 + " dan " + value2 + " adalah " + result);
    }
}
