import java.util.Random;

public class DiceRoll {
    public static void main(String [] args) {
        Random generateRandomInt = new Random();
        int x = generateRandomInt.nextInt(6) + 1;

        System.out.println("You rolled a " + x);
    }
}
