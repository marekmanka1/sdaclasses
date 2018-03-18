package klb.recvsiter;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibRec(4));
        System.out.println(fibIte(4));
        System.out.println(powRec(5, 3));

    }

    private static int fibRec(int n){
        if(n<3 ){
            return 1;
        }
        return fibRec(n-2)+fibRec(n-1);
    }

    private static int fibIte(int n){
        int f1 = 0;
        int f2 = 1;

        if(n<1 ){
            return 1;
        }

        for (int i = 1; i < n; i++) {
            int wy = f1+f2;
            f1=f2;
            f2=wy;

        }
        return f2;
    }


    private static double powRec(double x, int n){
        if(n==0 ){
            return 1;
        }
        return powRec(x,n-1)*x;
    }

}