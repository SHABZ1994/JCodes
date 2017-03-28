import java.util.Scanner;
import java.text.DecimalFormat;

public class BodyMassIndex{
	public static void main(String[]args){
		//Instance of Scanner
		Scanner H = new Scanner(System.in);
		Scanner M = new Scanner(System.in);
		
		//Limiting Decimal points
		DecimalFormat limit = new DecimalFormat("00.00");
	
		//Declaration of variables
		double Mass = 0.0;
		double Height = 0.0;
		double bmi = 0.0;
		
		//Method to take in input
		System.out.println("Please insert your body weight in Kg.");
		Mass =M.nextDouble();
		System.out.println("Please insert your height in meters.");
		Height = H.nextDouble();
		
		//Calculation of BMI
		bmi = Mass/(Height*Height);
		
		//Criteria of output
		if(bmi<18.5){
			System.out.println("You are Underweight."+"Your BMI is:"+ limit.format(bmi));
		}
		else if(bmi>=18.5 && bmi<25){
			System.out.println("You are Normal weight."+"Your BMI is:"+ limit.format(bmi));
		}
		else if(bmi>=25 && bmi<30){
			System.out.println("You are Overweight."+"Your BMI is:"+ limit.format(bmi));
		}
		else{
			System.out.println("You are Obese."+"Your BMI is:"+ limit.format(bmi));
		}
	}
}