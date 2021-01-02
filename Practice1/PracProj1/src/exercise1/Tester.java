package exercise1;
import java.lang.Math;
public class Tester {
    public static void main(String Args[]){
        //Finding roots of 2nd Degree Quadratic equation
        int a=1,b=4,c=4; 
        double disc=((b*b)-4*a*c); //The formula to find Discrimenant b^2-4*a*c
        System.out.println("The Discriminant is "+disc);
        if(disc==0){
            //If discrimenant equals 0 roots are equal
            long root=(-b/2*a);
            System.out.println("The roots are equal "+root);
        }
        else if(disc>0){
            Double root1=((-b-Math.sqrt(Math.abs(disc)))/2*a);
            Double root2=((-b+Math.sqrt(Math.abs(disc)))/2*a);
            System.out.println("The Unequal roots are "+root1+" & "+root2);
        }
        else{
            System.out.println("NO Real roots exists");
        }

    }
    
}
