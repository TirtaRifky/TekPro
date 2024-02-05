public class Soal2{
    public static void main (String[] args){
        int i = 42;
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
}
/** Output berupa text "everything" Ternary -- ditandai dengan adanya "?" dan ":", pada source code ini dinyatakan apabila i kurang dari 40 maka s diassign "life" 
dan apabila nilai i lebih dari 50 maka s diassign "universe" dan jika tidak keduanya s diassign "everything"**/
