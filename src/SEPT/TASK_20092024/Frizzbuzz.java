package SEPT.TASK_20092024;

import java.util.Scanner;

public class Frizzbuzz {
    public static void main(String[] args) {
        // print a num from 1 to 100 N=100
        //multiplies by 3 print frizz
        //multiplies by 5 print buzz
        // both 3 and 5 print frizz buzz
        // in this program we have to write both method in frst
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
                int n= sc.nextInt();


        Scanner SC= new Scanner(System.in);
        System.out.println("Enter the value of i");
        int i= sc.nextInt();

        for (; i <= n ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("Frizzbuzz");
            } else if (i%3==0) {
                System.out.println("Frizz");

            }else if(i%5==0){
                System.out.println("Buzz");
            }else {
                System.out.println("Not a frizzbuzz value"+ i);
            }


        }
    }
}
