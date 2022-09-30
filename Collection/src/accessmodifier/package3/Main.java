package accessmodifier.package3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Perhitungan = " + Perhitungan.nilai);
        for(int i=0; i<5; i++){
            new Perhitungan();
        }
//        System.out.println("Perhitungan = " + Perhitungan.nilai); // akses atribut/properti
        System.out.println("Perhitungan = "+ Perhitungan.getNilai()); // akses method



        TransientProperti tp = new TransientProperti();

        System.out.println(tp.nilaiA);


    }
}
