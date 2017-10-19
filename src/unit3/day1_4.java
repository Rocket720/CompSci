package unit3;

import java.util.Scanner;

public class day1_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		double one = input.nextDouble();
		double two = input.nextDouble();
		double three = input.nextDouble();
		
		System.out.println("How do you want me to sort? Ascending or Descending?");
		String sort = input.next();
		
		if(sort.equals("ascending") || sort.equals("Ascending")){
			System.out.println("In ascending order: " + Math.min(Math.min(one, two), three) + ", " + (((one+two+three) - (Math.max(Math.max(one, two), three)) - Math.min(Math.min(one, two), three))) + ", " + Math.max(Math.max(one, two), three));
		}
		else if(sort.equals("descending") || sort.equals("Descending")) {
			System.out.println("In descending order: " + Math.max(Math.max(one, two), three) + ", " + (((one+two+three) - (Math.max(Math.max(one, two), three)) - Math.min(Math.min(one, two), three))) + ", " + Math.min(Math.min(one, two), three));

		}
		else {
			System.out.println("U dumb.");
		}
		
	}

}
