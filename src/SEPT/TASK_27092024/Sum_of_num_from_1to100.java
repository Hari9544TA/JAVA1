package SEPT.TASK_27092024;

public class Sum_of_num_from_1to100 {
    public static void main(String[] args){
        int a=1;
        int sum=0;
        while (a<=100){
           // sum += a;
            System.out.println("the sum of num a:"+a +" ->"+ (sum+=a));
            a++;
        }
    }
}
