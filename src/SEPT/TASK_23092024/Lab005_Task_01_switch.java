package SEPT.TASK_23092024;

public class Lab005_Task_01_switch {
    public static void main(String[] args) {
        int num1=10,num2=20;
        String choice="Multi";
        switch (choice){
            case "add" -> System.out.println("The additin of Num1 and Num2:"+ (num1+num2));
            case "mul" -> System.out.println("The Sub of Num1 and Num2:"+ (num1-num2));
            case "divi"-> System.out.println("The Divi of Num1 and Num2:"+ (num1/num2));
            case "Multi" -> System.out.println("The Multiply of Num1 and Num2:"+ (num1*num2));
            case "modul" -> System.out.println("The Moduls of Num1 and Num2:"+ (num1%num2));



        }
    }
}
