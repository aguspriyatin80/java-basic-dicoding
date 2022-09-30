package accessmodifier.package1;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
        // memberA dan functionA() tidak bisa diakses karena menggunakan access modifier PRIVATE hanya bisa dipanggil di dalam kelasnya
//        System.out.println(kelasA.memberA);
//        System.out.println(kelasA.functionA());
        // functionB() menggunakan access modifier DEFAULT sehingga masih dapat diakses di luar kelasnya tetapi masih dalam satu package
        System.out.println(kelasA.functionB());
        // memberB dan memberC dapat diaccess karena menggunakan DEFAULT access modifier maka masih dapat diakses dalam satu package
        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
    }
}
