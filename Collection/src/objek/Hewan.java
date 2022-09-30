package objek;

public class Hewan {

    private String nama;
    private int berat;
    private int jumlahKaki;

    public Hewan (String namaHewan){
        nama = namaHewan;
    }

    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahKaki = jumlahKakiHewan;
    }
    public void cetakHewan(){
        System.out.println("Nama hewan: "+nama);
        System.out.println("Berat: " + berat);
        System.out.println("Jumlah kaki: "+ jumlahKaki);
    }
}
