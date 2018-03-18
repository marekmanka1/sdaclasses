package klb.permcheck;

public class Main {
    public static void main(String[] args) {
        //int[] intArray = new int[0];
        int[] intArray = {3, 1, 2, 4};
        Solutions S = new Solutions();

        System.out.println(S.solution1(intArray));
        System.out.println(S.solution2(intArray));
        System.out.println(S.solution3(intArray));
        System.out.println(S.solution4(intArray));
    }
}
