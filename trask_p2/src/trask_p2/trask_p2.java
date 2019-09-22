package trask_p2;

import java.util.Scanner;

public class trask_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Body Mass Index (BMI) calculator!");
		
		System.out.println("");
		
		System.out.println("Please select which calculator you would like to use, English or Metric,");
		System.out.println("by typing the number 1 or 2, respectively.");
		System.out.println("");
		System.out.println("(1)\tBMI = (703 x weightInPounds) / heightInInches^2");
		System.out.println("");
		System.out.println("(2)\tBMI = weightInKilograms / heightInMeters^2");
		System.out.println("");
		System.out.println("Selection:");
		System.out.println("");
		
		Scanner scnr = new Scanner(System.in);
		int c = scnr.nextInt();
		
		System.out.println("");
		
		if (c == 1) {
			System.out.println("You have chosen option 1, the English BMI calculator!");
			System.out.println("");
			System.out.println("BMI = (703 x weightInPounds) / heightInInches^2");
			System.out.println("Please enter your weight in pounds:");
			System.out.println("");
			Scanner wt = new Scanner(System.in);
			double weightInPounds = wt.nextDouble();
			System.out.println("");
			System.out.println("Please enter your height in inches:");
			System.out.println("");
			Scanner ht = new Scanner(System.in);
			double heightInInches = ht.nextDouble();
			System.out.println("");
			double BMI = (703.00 * weightInPounds) / (heightInInches * heightInInches);
			System.out.println("Your Body Mass Index (BMI) is " + BMI);
			System.out.println("");
			System.out.println("These are the BMI Categories as defined by the National Heart, Lung, and Blood Institute:");
			System.out.println("");
			System.out.println("Underweight = < 18.5");
			System.out.println("Normal weight = 18.5 - 24.9");
			System.out.println("Overweight = 25 - 29.9");
			System.out.println("Obesity = > 30");
			System.out.println("");
			System.out.println("Thank you for using the Body Mass Index (BMI) calculator!");
			
			
			
		} else if (c == 2) {
			System.out.println("You have chosen option 2, the Metric BMI calculator!");
			System.out.println("");
			System.out.println("BMI = weightInKilograms / heightInMeters^2");
			System.out.println("Please enter your weight in kilograms:");
			System.out.println("");
			Scanner wt = new Scanner(System.in);
			double weightInKilograms = wt.nextDouble();
			System.out.println("");
			System.out.println("Please enter your height in meters:");
			System.out.println("");
			Scanner ht = new Scanner(System.in);
			double heightInMeters = ht.nextDouble();
			System.out.println("");
			double BMI = (weightInKilograms) / (heightInMeters * heightInMeters);
			System.out.println("Your Body Mass Index (BMI) is " + BMI);
			System.out.println("");
			System.out.println("These are the BMI Categories as defined by the National Heart, Lung, and Blood Institute:");
			System.out.println("");
			System.out.println("Underweight = < 18.5");
			System.out.println("Normal weight = 18.5 - 24.9");
			System.out.println("Overweight = 25 - 29.9");
			System.out.println("Obesity = > 30");
			System.out.println("");
			System.out.println("Thank you for using the Body Mass Index (BMI) calculator!");
		
		}
		
	}

}
