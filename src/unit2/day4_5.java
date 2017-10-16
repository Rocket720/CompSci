import java.util.Scanner;

public class day4_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int binary = input.nextInt();
		String binS = Integer.toString(binary);
		int base = input.nextInt();
		int binE = base;
		int co = 1;

		for(int i = binS.length(); i > 0; i--){

			/*while(binE>(Math.pow(base, i))){
				co++;
				binE = co * binE;
			}*/
			System.out.println("i dun");
		}

	}

}
