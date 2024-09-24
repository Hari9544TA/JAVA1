package SEPT.TASK_18092024;

public class Lab003_increment_and_decrement {
    public static void main(String[] args) {
    //System.out.println(  --a + a --  + a-); System.out.println(a);
        int a=10;
        System.out.println( --a + a-- + a--); // Expression (9+9+8)=26 | A value(9+8+7) --> value of a is 7
        System.out.println("the Ans of 1 Ques is ="+ a);

//
        //System.out.println(  --a + a++ + a—); System.out.println(a);
int a1=10;
        System.out.println( --a1 + a1++ + a1--); // Expression (9+10+9)=28 | A value(9+10+9) --> value of a is 9
        System.out.println("the ans of 2 ques is ="+a1);

        // System.out.println(  a- - + a --  + a --); System.out.println(a);
        int a2=10;
        System.out.println( a2-- + a2-- + a2--); // Expression (10+9+8)=27 | A value(9+8+7) --> value of a is 8
        System.out.println("the ans of 3 ques is ="+a2);
    }

}
