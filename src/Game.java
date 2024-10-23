import java.util.HashSet;
import java.util.Scanner;

public class Game {
    HashSet<Integer> guesses = new HashSet<>();
    int res;
    int guess;
    int tries;

    public void init(){
        guesses.clear();
        tries = 0;
        do{res = (int) (Math.random() * 10);}while(res == 0);
    }

    public boolean guess(int res, Scanner sc){
        System.out.println("Guess number(1-10): ");
        guess = sc.nextInt();
        guesses.add(guess);
        tries++;
        if (guess != res) {
            System.out.println("You are wrong! You tried: " + guesses);
            return false;
        } else {
            return true;
        }
    }
}
