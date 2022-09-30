package accessmodifier.package3;

public class Perhitungan {
    public static int nilai = 0;
    final int value = 5;
    protected static int getNilai(){
        return nilai;
    }
    Perhitungan(){
        nilai++;
    }

//    void ubahValue(){
//        value++; // ini error karena value sudah diinisiasi dan hanya bisa sekali
//    }
}
