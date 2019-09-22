import java.util.Scanner;

public class trask_p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int a7 = 0;
		int a8 = 0;
		int a9 = 0;
		int a10 = 0;
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		int b4 = 0;
		int b5 = 0;
		int b6 = 0;
		int b7 = 0;
		int b8 = 0;
		int b9 = 0;
		int b10 = 0;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		int c6 = 0;
		int c7 = 0;
		int c8 = 0;
		int c9 = 0;
		int c10 = 0;
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		int d4 = 0;
		int d5 = 0;
		int d6 = 0;
		int d7 = 0;
		int d8 = 0;
		int d9 = 0;
		int d10 = 0;
		int e1 = 0;
		int e2 = 0;
		int e3 = 0;
		int e4 = 0;
		int e5 = 0;
		int e6 = 0;
		int e7 = 0;
		int e8 = 0;
		int e9 = 0;
		int e10 = 0;
		
		int Choice = -1;
		boolean exit = false;
		
		do {
			System.out.println("Please select an option from below:");
			System.out.println("");
			System.out.println("--------------------------------------------------");
			System.out.println("");
			System.out.println("1. Take survey");
			System.out.println("2. Display overall results of survey");
			System.out.println("");
			System.out.println("0. Exit program");
			System.out.println("");
			System.out.println("--------------------------------------------------");
			System.out.println("");
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the number corresponding to one of the choices above:");
			System.out.println("");
			Choice = Integer.parseInt(input.nextLine());
			
			while(Choice < 0 || Choice > 2) {
					System.out.println("Invalid selection. Please try again.");
					System.out.println("");
					break;
				}
			
			switch (Choice) {
			
			case 1 :
		
		System.out.println("");
		System.out.println("On a scale of 1 to 10, with 1 being little to no value and 10 being exceptional value,");
		System.out.println("how would you rate the value of an education at Univeristy of Central Florida?");
		System.out.println("");
		Scanner ucf = new Scanner(System.in);
		System.out.println("");
		int v = ucf.nextInt();
		if (v == 1) {
			a1 = a1 + 1;
		}
		else if (v == 2) {
			a2 = a2 + 1;
		}
		else if (v == 3) {
			a3 = a3 + 1;
		}
		else if (v == 4) {
			a4 = a4 + 1;
		}
		else if (v == 5) {
			a5 = a5 + 1;
		}
		else if (v == 6) {
			a6 = a6 + 1;
		}
		else if (v == 7) {
			a7 = a7 + 1;
		}
		else if (v == 8) {
			a8 = a8 + 1;
		}
		else if (v == 9) {
			a9 = a9 + 1;
		}
		else if (v == 10) {
			a10 = a10 + 1;
		}
		
		
		
		System.out.println("");
		System.out.println("On a scale of 1 to 10, with 1 being little to no value and 10 being exceptional value,");
		System.out.println("how would you rate the value of an education at University of South Florida?");
		System.out.println("");
		Scanner usf = new Scanner(System.in);
		System.out.println("");
		int w = usf.nextInt();
		if (w == 1) {
			b1 = b1 + 1;
		}
		else if (w == 2) {
			b2 = b2 + 1;
		}
		else if (w == 3) {
			b3 = b3 + 1;
		}
		else if (w == 4) {
			b4 = b4 + 1;
		}
		else if (w == 5) {
			b5 = b5 + 1;
		}
		else if (w == 6) {
			b6 = b6 + 1;
		}
		else if (w == 7) {
			b7 = b7 + 1;
		}
		else if (w == 8) {
			b8 = b8 + 1;
		}
		else if (w == 9) {
			b9 = b9 + 1;
		}
		else if (w == 10) {
			b10 = b10 + 1;
		}
		
		
		
		System.out.println("");
		System.out.println("On a scale of 1 to 10, with 1 being little to no value and 10 being exceptional value,");
		System.out.println("how would you rate the value of an education at University of Florida?");
		System.out.println("");
		Scanner uf = new Scanner(System.in);
		System.out.println("");
		int x = uf.nextInt();
		if (x == 1) {
			c1 = c1 + 1;
		}
		else if (x == 2) {
			c2 = c2 + 1;
		}
		else if (x == 3) {
			c3 = c3 + 1;
		}
		else if (x == 4) {
			c4 = c4 + 1;
		}
		else if (x == 5) {
			c5 = c5 + 1;
		}
		else if (x == 6) {
			c6 = c6 + 1;
		}
		else if (x == 7) {
			c7 = c7 + 1;
		}
		else if (x == 8) {
			c8 = c8 + 1;
		}
		else if (x == 9) {
			c9 = c9 + 1;
		}
		else if (x == 10) {
			c10 = c10 + 1;
		}
		
		
		
		System.out.println("");
		System.out.println("On a scale of 1 to 10, with 1 being little to no value and 10 being exceptional value,");
		System.out.println("how would you rate the value of an education at Florida State University?");
		System.out.println("");
		Scanner fsu = new Scanner(System.in);
		System.out.println("");
		int y = fsu.nextInt();
		if (y == 1) {
			d1 = d1 + 1;
		}
		else if (y == 2) {
			d2 = d2 + 1;
		}
		else if (y == 3) {
			d3 = d3 + 1;
		}
		else if (y == 4) {
			d4 = d4 + 1;
		}
		else if (y == 5) {
			d5 = d5 + 1;
		}
		else if (y == 6) {
			d6 = d6 + 1;
		}
		else if (y == 7) {
			d7 = d7 + 1;
		}
		else if (y == 8) {
			d8 = d8 + 1;
		}
		else if (y == 9) {
			d9 = d9 + 1;
		}
		else if (y == 10) {
			d10 = d10 + 1;
		}
		
		
		
		System.out.println("");
		System.out.println("On a scale of 1 to 10, with 1 being little to no value and 10 being exceptional value,");
		System.out.println("how would you rate the value of an education at University of Miami?");
		System.out.println("");
		Scanner um = new Scanner(System.in);
		System.out.println("");
		int z = um.nextInt();
		if (z == 1) {
			e1 = e1 + 1;
		}
		else if (z == 2) {
			e2 = e2 + 1;
		}
		else if (z == 3) {
			e3 = e3 + 1;
		}
		else if (z == 4) {
			e4 = e4 + 1;
		}
		else if (z == 5) {
			e5 = e5 + 1;
		}
		else if (z == 6) {
			e6 = e6 + 1;
		}
		else if (z == 7) {
			e7 = e7 + 1;
		}
		else if (z == 8) {
			e8 = e8 + 1;
		}
		else if (z == 9) {
			e9 = e9 + 1;
		}
		else if (z == 10) {
			e10 = e10 + 1;
		}
		
		System.out.println("");
		System.out.println("Thank you for completing the survey!");
		System.out.println("");
			
		break;
		

			case 2 :
		int a[] = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};
		int b[] = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};
		int c[] = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
		int d[] = {d1, d2, d3, d4, d5, d6, d7, d8, d9, d10};
		int e[] = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10};
		int resultsArray[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
								{a1, a2, a3, a4, a5, a6, a7, a8, a9, a10}, {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10}, 
								{c1, c2, c3, c4, c5, c6, c7, c8, c9, c10}, {d1, d2, d3, d4, d5, d6, d7, d8, d9, d10}, 
								{e1, e2, e3, e4, e5, e6, e7, e8, e9, e10}};
		
		System.out.println("");
		
		
		printarray(resultsArray);

		
		System.out.println("");
		
		break;
		
		
				
			case 0 :
				System.out.println("");
				System.out.println("Thank you for using this survey program!");
				exit = true;
				
				break;
				
				
				
				
				
		}	
	} while (!exit);
	}
	

public static void printarray(int t[][]) {
	
	String topics[] = {"Ratings:", "UCF\t", "USF\t", "UF\t", "FSU\t", "UM\t"};
	
	for( int row = 0 ; row < t.length ; row++ ) {

		System.out.print(topics[(row)] + "\t");

		for( int column = 0 ; column < t[row].length ; column++ ) {

			System.out.print( t[row][column] + " " );
		}
		
		System.out.println("");
		
	}
}
}
