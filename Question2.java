import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Height in Meters: ");
    double height = in.nextDouble();
    System.out.print("Enter weight in Kilograms: ");
    double weight = in.nextDouble();
    double BMI = weight/ (height*height);
    system.out.println("Your BMI is: " + BMI);
  }
}
