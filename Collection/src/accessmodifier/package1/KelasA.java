package accessmodifier.package1;

public class KelasA {
    private int memberA = 5;

    char memberB = 'A';
    double memberC = 1.5;

    private int functionA(){
        return memberA;
    }

    int functionB(){
        // pemanggilan private member dan private function dapat dilakukan
        int hasil = functionA() + memberA;
        return hasil;
    }

    protected void methodC(){
        System.out.println("Percobaan access modifier!!!");
    }
}
