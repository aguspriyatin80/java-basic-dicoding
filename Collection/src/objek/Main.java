package objek;

public class Main {
    public static void main(String[] args) {
        Hewan elang = new Hewan("Elang");
        Hewan kucing = new Hewan("Kucing");

        System.out.println("ELANG");
        elang.jumlahKakiHewan(2);
        elang.beratHewan(3);
        elang.cetakHewan();

        System.out.println("KUCING");
        kucing.jumlahKakiHewan(4);
        kucing.beratHewan(2);
        kucing.cetakHewan();


    }

}
