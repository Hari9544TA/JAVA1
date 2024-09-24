package SEPT.TASK_18092024;

public class Lab002_WideningandNarrowing {
    public static void main(String[] args) {
        // Widening
        int implict=200;
        long Im=implict;
        System.out.println(Im);
        int Explict=300;
        long Im1=(long)Explict; // put the datatype in to bract only iin the type casting scenarios
        System.out.println("the value of Im1 is :"+Im1);

        //Narrowing Always we lost a data in this concept
        //Implict is not applicable for this JVM will not allow this
        //Explict is applicable but we need to mention the datatype
        //used to round up the values
        float a=232/7f;
        System.out.println(a);
        float pie =3.14f;
        int b=(int)(a+pie);
        System.out.println( "the narroeing value of b is :"+b);
    }
}
