package klb.rozgrzewka1;

public class SolutunRoz {
    public static boolean solution(int[] intArray) {
        int intSum = intArray[0]+intArray[intArray.length-1];
        boolean wynik = false;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]==intSum){
                System.out.println("intSum=" + intSum + "  intrArray=" + intArray[i]);
                return true;
            }
        }

    return false;
    }
}
