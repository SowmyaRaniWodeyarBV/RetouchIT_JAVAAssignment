package ConditionalStatementsQuestions;

//03.What will be the value of X and Y ?


public class Question03 {
    public static void main(String[] args) {
        int a  = 63 , b = 36;
         boolean x = (a < b ) ? true : false;
         int y = (a > b) ? a : b;
         //result
        System.out.println("Output of X : " + x);
        System.out.println("Output of Y : " + y);
    }
}
