import java.util.Scanner;
public class TestClassSID{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a value for side 1: ");
double side1= sc.nextDouble();
System.out.println("Enter a value for side 2: ");
double side2= sc.nextDouble();
double hypotenuse= Math.sqrt((side1*side1)+(side2*side2));
System.out.println("The length of the hypotenuse is: "+hypotenuse);
}
}