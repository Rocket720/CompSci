import java.util.Scanner;

public class day6_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the event start time");
		int hour = input.nextInt();
		int minute = input.nextInt();
		int second = input.nextInt();
		String ampm = input.next();

		System.out.println("Enter the event end time");
		int hour1 = input.nextInt();
		int minute1 = input.nextInt();
		int second1 = input.nextInt();
		String ampm1 = input.next();

		if(ampm.equals("pm")){
			hour = hour + 12;
		}
		if(ampm1.equals("pm")){
			hour1 = hour1 + 12;
		}
		int hourf = hour1 - hour;
		int minutef = minute1 - minute;
		int secondf = second1 - second;

		if(secondf < 0) {
			minutef--;
			secondf = 60 - Math.abs(secondf);
		}
		if(minutef < 0) {
			hourf--;
			minutef = 60 - Math.abs(minutef);
		}
		System.out.println("The event lasted for " + hourf + " hours, " + minutef + " minutes, and " + secondf + " seconds");
	}

}
