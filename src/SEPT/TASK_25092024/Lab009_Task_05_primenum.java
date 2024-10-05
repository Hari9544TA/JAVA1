package SEPT.TASK_25092024;



public class Lab009_Task_05_primenum {
    public static void main(String[] args) {
        int i,j;
        for (i = 1; i <=100; i++) {
            for (j = 2; j <i ; j++) {
                if(i%j==0){
                    break;
                }

                }
            if(i==j){
                System.out.println("the prime number is:"+ i);
            }
            
        }
          
    }
}



