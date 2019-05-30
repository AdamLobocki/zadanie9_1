import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbersRandom = new int[10];
        int x = numbersRandom.length - 1;

        for (int i = 0; i < numbersRandom.length; i++) {
            numbersRandom[i] = random.nextInt(500);
        }

        for (int i = 0; i <=numbersRandom.length * 2 - 1; i++) {
            if(i<numbersRandom.length){
                System.out.print(numbersRandom[i] + ", ");

            }
            else {
                System.out.print(numbersRandom[x] + ", ");
                x--;
            }
        }

    }
}
