package SEPT.TASK_27092024;

public class Difference_bw_dowhile_while {
    public static void main(String[] args) {
        int a=0;
        int sum=0;
//        do {
//            sum+=a;
//            System.out.println("the sum of numbers from 1 to 100:a("+a+")"+"-->"+sum);
//            a++;
//        }
//        while(a<=100);
        while (a<=100){
            // sum += a;
            System.out.println("the sum of num a:"+a +" ->"+ (sum+=a));
            a++;
        }
    }
}
