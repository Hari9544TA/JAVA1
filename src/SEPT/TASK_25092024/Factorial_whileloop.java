package SEPT.TASK_25092024;

public class Factorial_whileloop {
    public static void main(String[] args) {
        int a=1;
        int Factorial=1;
        while(a<=5){
            Factorial*=a;
            System.out.println("The factorial of 5:"+ Factorial);
            a++;
        }

    }
}
