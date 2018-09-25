import java.util.Scanner;

public class BMI{

    public static void main(String[] args){
    //declare\\
    int inches;
    int Pounds;
    float Meters;
    float Kilograms;
    float Total;



    Scanner keyboard;

    //initializing\\

    keyboard = new Scanner(System.in);


    System.out.println("What is your height inches.");
    inches = keyboard.nextInt();
    Meters = inches *(0.0254f);
    System.out.println("What is your weight in pounds.");
    Pounds = keyboard.nextInt();
    Kilograms = Pounds *(0.453592f);
    Total = Kilograms/(Meters*Meters);
    System.out.println("Your BMI is "+Total+".");
    }






}

