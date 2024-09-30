package SEPT.TASK_20092024;

import java.sql.SQLOutput;

public class Lab004_TrenaryOperators {
    public static void main(String[] args) {
        int Score = 90;
        String grade1 = (Score >= 90) ? "B" : "A";
        System.out.println("The Grade of Score >= 90 is :" + grade1);
        String grade2 = (Score >= 80) ? "B" : "C";
        System.out.println("The Grade of Score >= 80 is :" + grade2);
        String grade3 = (Score >= 70) ? "C" : "A";
        System.out.println("The Grade of Score >= 70 is :" + grade3);

        int score  = 70;
  String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D"  ;
         System.out.println(grade);
    }
}

