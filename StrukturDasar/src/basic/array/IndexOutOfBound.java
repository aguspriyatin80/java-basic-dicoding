package basic.array;

public class IndexOutOfBound {
    public static void main(String[] args) {
        int[] newArr = {1,2,3,4};
        System.out.println(newArr[0]);
        System.out.println(newArr[1]);
        System.out.println(newArr[2]);
        System.out.println(newArr[3]);

        System.out.println(newArr[4]);
    }
}
