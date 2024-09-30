package SEPT.EX26092024;

public class Lab003_ifelse2 {
    public static void main(String[] args) {
        int Score=76;
        char Grade='F';
        if(Score >=90 && Score<=100) {
            Grade = 'A';
        } else if (Score>=80 && Score<=89) {
            Grade='B';
        }else if (Score>=60 && Score<=79){
            Grade='C';
        }
        else{
            Grade='F';
    }
        System.out.println("Greade is:"+ Grade);
    }
}
