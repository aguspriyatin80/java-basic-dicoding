package basic.array;

public class LoopingArray {
    public static void main(String[] args) {
        int[] loopingArr = new int[1000];
        for(int i = 0; i < loopingArr.length; i++){
            loopingArr[i] = i + 1;
            System.out.println(loopingArr[i]);
        }
    }
}
