package klb.permcheck;

public class Solutions {

    public static int solution1(int[] A) {
        int[] intControl = new int[A.length];
        int intC = 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if ((i + 1) == A[j]) {
                    intControl[i] = 1;
                }
            }
        }
        for (int i = 0; i < intControl.length; i++) {
            intC = intC * intControl[i];
        }
        return intC;

    }


    public static int solution2(int[] A) {
        int intControl1 = 1;
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                if ((i + 1) == A[j]) {
                    intControl1 = 1;
                }
            }

        }

        return intControl1;

    }

    public static int solution3(int[] A) {

        int intC1 = 1;
        int intC2 = 1;
        int intC = 0;

        for (int i = 0; i < A.length; i++) {
            intC1 = intC1 * (i + 1);
            intC2 = intC2 * A[i];
        }
        if (intC1 == intC2) {
            intC = 1;

        }
        return intC;

    }

    public static int solution4(int[] A) {
        int size = A.length;
        int[] intControl = new int[size];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 || A[i] < 1) {
                return 0;
            }

            //czy kol el wystapił wcześniej
            if(intControl[A[i]-1]==1) {
                return 0;
            }else{
                intControl[A[i]-1]=1;
            }
        }

        return 1;
    }

}
