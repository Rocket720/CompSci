package unit10;

public class day1_1 {

    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Position " + i + " contains " + array[i]);
        }
    }

}
