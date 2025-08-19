package OperatorsQuestions;

public class Question03 {
    public static void main(String[] args) {
         int x = 10 , y = 5 ;

         int exp1 = ( y * (x / y + x / y));
         int exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);
        System.out.println(exp2);
    }
}



// 1. 5 * ( 10 / 5 + 10 / 5)
//    5 * ( 2 + 2)
//    5 * 4 = 20;
// 2. (5 * 10 / 5 + 5 * 10 / 5)
//     5 * 2 + 5 * 2
//      10 + 10 = 20;