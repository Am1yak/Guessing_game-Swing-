import javax.swing.*;
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

    public void guess(Frame frame){
        guesses.add(guess);
        tries++;
        if (guess != res) {
            frame.guesseslabel.setText("Wrong! You tried: " + guesses);
        } else {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "You guessed! Starting new game");
            this.init();
            frame.guesseslabel.setText("You tried:");
        }
    }
}

