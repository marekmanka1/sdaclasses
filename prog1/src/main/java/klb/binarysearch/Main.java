package klb.binarysearch;

public class Main {
    public static void main(String[] args) {
        double[] T = {3, 3.2, 4, 4, 5.3, 9, 11.2, 12};
//               i          s          j
        System.out.println(find(4, T));


    }

    //T posortowana niemalejąco
    private static boolean find(double x, double[] T) {
        int i = 0, j = T.length - 1;
        while (i < j) {
            int s = (i + j) / 2;
            if (T[s] == x) {
                return true;
            }
            if (x < T[s]) {
                //szukać z lewej strony
                j = s - 1;
            } else {
                j = s + 1;
            }
        }
        return false;
    }//O(logn)

}
