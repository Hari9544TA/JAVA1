package SEPT.TASK_23092024;

public class Lab007_Task_03_Switch {
    public static void main(String[] args) {
        int Chioce_1=100;
        switch (Chioce_1){
            case 100:
                System.out.println("conversion of km to miles *0.621371:"+(Chioce_1*0.621371));
                case 2:
                System.out.println("conversion of F to C :°C = (°F - 32) × 5/9:"+((Chioce_1-32)*5/9));
                break;

            default:
                System.out.println("invalid Retry");

        }
    }
}
