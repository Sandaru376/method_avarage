package method;

import java.util.Scanner;

public class avg {
    public static double avarage(double x,double y,double z){
        return (x+y+z)/3;
    }

 public static void main(String[] args) {
    Scanner number=new Scanner(System.in);

    System.out.print("Enter first number=");
    double x=number.nextDouble();

    System.out.print("Enter second number=");
    double y=number.nextDouble();

    System.out.println("Enter third number=");
    double z=number.nextDouble();

    System.out.println("your avrage is=" + avarage(x,y,z));
 }   
}
