package propertimethod;

public class Hewan {
    // property atau field

    //inisiasi dengan nilai inisial
    private String nama;
    private double berat = 2;

    private double tinggi = 20;

    //inisiasi melalui constructor
    int umur;

//    Hewan(int umurParam){
//        umur = umurParam;
//    }
    // konstruktor menggunakan this dengan nama properti dan nama parameter yang sama
    Hewan(int umur){
        this.umur = umur;
    }

    void makan(){
        System.out.println("Makan dengan lahap");
    }

    void lari(){
        System.out.println("Lari dengan kencang");
    }

    void jalan(){
        System.out.println("Jalan dengan cepat");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi(){
        return tinggi;
    }

}
