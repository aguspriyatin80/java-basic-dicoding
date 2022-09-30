package function;

public class InputFunction {
    public static void main(String[] args) {
        hitungLuas(40.0,25.0);
        hitungLuas(10,5);
    }

    public static void hitungLuas(double p, double l){
        double luas = p * l;
        System.out.println(luas);
    }
    //OVERLOADING = membuat fungsi dengan nama yang sama tetapi jumlah atau tipe parameter berbeda
    public static void hitungLuas(int p, int l){
        int luas = p * l;
        System.out.println(luas);
    }
}
