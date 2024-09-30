package SEPT.EX26092024;

public class If_else {
    public static void main(String[] args) {
        int Score=99;
        char Grade= 'D';
        if (Score>=90) {
            Grade = 'A';
        } else if (Score>=80) {
            Grade='B';

        } else if (Score>=70) {
            Grade='C';
        }else {
            Grade='D';

        }
        System.out.println("the grade value is:"+Grade);
    }
}
