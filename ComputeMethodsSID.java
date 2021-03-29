import java.util.Scanner;
public class ComputeMethodsSID{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Fahrenheit temperature: ");
double temperature = sc.nextDouble();
double celsius = (temperature-32)*5/9;
System.out.println("The Celsius temperature is: "+ celsius);
}
}
