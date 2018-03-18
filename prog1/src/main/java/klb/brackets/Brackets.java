package klb.brackets;

import java.util.Stack;

public class Brackets {

    public int solution(String S) {
        int numBra = 0; //();
        int numBra1 = 0; //();
        int numBra1p = 0; //();
        int numBra2 = 0; //[];
        int numBra2p = 0; //[];
        int numBra3 = 0; //{};
        int numBra3p = 0; //{};
        Stack<Character> stack = new Stack<Character>();

        if (S.length() == 0) {
            return 1; //OK
        }

        //System.out.println(c);
        if (!(S.charAt(0) == '(' || S.charAt(0) == '[' || S.charAt(0) == '{')) {
            return 0; //BAD
        }

        String stosBra = "";

        for (int i = 0; i < S.length(); i++) {
                  if(S.charAt(i) == '(' || S.charAt(i) == '[' || S.charAt(i) == '{' ||
                          S.charAt(i) == ')' || S.charAt(i) == ']' || S.charAt(i) == '}'  ){
                      stosBra = stosBra + S.charAt(i);
                  }
        }

        if (stosBra.length()%2 == 1){
            System.out.println(1);
            return 0; //BAD
        }

        //         {[()()]}

//        if (stosBra.charAt(0) == '('){
//            for (int i = 0; i < stosBra.length(); i++) {
//                if (stosBra.charAt(i) != '(' || stosBra.charAt(i) != ')'){
//                    return 0;
//                }
//                if (stosBra.charAt(i) == '('){
//                    stack.push(stosBra.charAt(i));
//                }
//                if
//            }
//
//
//
//
//        }



        return 0;
    }

}
