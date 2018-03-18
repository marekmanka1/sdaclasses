package klb.binarygap;

public class BinaryGap {
    public static int solution(int N) {

        String binaryN = Integer.toBinaryString(N);

        System.out.println(binaryN);

        int binaryGap = 0;
        int tempGap = 0;
        for (int i = 0; i < binaryN.length(); i++) {

            if (binaryN.charAt(i) == '0') {
                tempGap++;
            }

            if (binaryN.charAt(i) == '1') {
                if (tempGap > 0 && tempGap > binaryGap) {
                    binaryGap = tempGap;
                }
                tempGap = 0;
            }
        }

        return binaryGap;
    }

    public static StringBuilder binConverter(int n){
        StringBuilder result = new StringBuilder();
        while (n>0){
            int bit = n%2;
            n = n/2;

        }
        return result.reverse();
    }



}
