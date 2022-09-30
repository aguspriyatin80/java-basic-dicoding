package function;

public class ReturnFunction {
    public static void main(String[] args) {
        double panjang = 10.0;
        double lebar = 5;
        System.out.println("Luasnya adalah "+ hitungLuas(panjang,lebar));
    }

    public static double hitungLuas(double p, double l){
        return p * l;
    }
}
