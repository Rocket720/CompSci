package unit3;

public class day1_5 {

	public static void main(String[] args) {
		
		int coin1 = (int) (Math.random()*2);	
		int coin2 = (int) (Math.random()*2);
		int coin3 = (int) (Math.random()*2);
		
		System.out.println("Heads - " + (coin1+coin2+coin3));
		System.out.println("Tails - " + (3-(coin1+coin2+coin3)));
	}

}
