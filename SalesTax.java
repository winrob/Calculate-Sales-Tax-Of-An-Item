import java.util.Scanner;
	public class SalesTax {
		public static void main(String[]args){
			//identifer declarations
			final double TAX_RATE = 0.07; // PROGRAM CONSTANT
			
			String item; //INPUT
			double price; //INPUT
			double tax; //OUTPUT
			double total; //OUTPUT
			
			//create a Scanner object to read from the keyboard
			Scanner scan = new Scanner(System.in);
			
			//display prompts and get input
			System.out.print("Item description: ");
			item = scan.nextLine();
			
			System.out.print("Item price: $");
			price = scan.nextDouble();
			
			//calculations
			tax = price * TAX_RATE;
			total = price + tax;
			
			//display results
			System.out.println (item + " $" + price);
			System.out.println ("Tax $" + tax);
			System.out.println ("Total $" + total);
	}
}