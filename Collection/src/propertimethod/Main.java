package propertimethod;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan(2);

        System.out.println("Kucing berusia "+ kucing.umur + " tahun dengan berat "+ kucing.getBerat() + " kg");
        kucing.jalan();
        kucing.lari();
        kucing.makan();

        // Perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( tinggi(m) * tinggi(m) )
        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);
    }
}
