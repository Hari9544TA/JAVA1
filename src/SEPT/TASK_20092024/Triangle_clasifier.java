package SEPT.TASK_20092024;

import java.util.Scanner;

public class Triangle_clasifier {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of Side 1:");
        int side1= sc.nextInt();

        System.out.println("Enter the value of Side 2:");
        int side2= sc.nextInt();

        System.out.println("Enter the value of Side 3:");
        int side3= sc.nextInt();
if(side1>=1 && side2>=1&& side3>=1) {
    if (side1 == side2 && side1 == side3 && side2 == side3) {
        System.out.println("the Triangle is Equilateral");
    } else if (side1 == side2 || side2 == side3 || side2 == side3) {
        System.out.println("The Triangle is Isolateral");
    } else {
        System.out.println("The Triangle is Scalene");
    }
} else{
        System.out.println("Invalid Entry");
    }


    }
}
