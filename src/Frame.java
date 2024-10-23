import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    JButton button;
    JTextField textField;
    JLabel guesseslabel;
    JLabel trieslabel;
    Game game;

    public void init(){
        game = new Game();
        game.init();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font basefont = new Font("Arial", Font.PLAIN, 20);

        JPanel gamepanel = new JPanel();
        gamepanel.setLayout(new BoxLayout(gamepanel, BoxLayout.Y_AXIS));

        JLabel name = new JLabel("Guessing game!");
        name.setBounds(0,0,300,70);
        name.setFont(basefont);
        gamepanel.add(name);

        JLabel proccesslabel = new JLabel("Guess the number from (1-10):");
        proccesslabel.setFont(basefont);
        gamepanel.add(proccesslabel);

        textField = new JTextField();
        textField.setMaximumSize(new Dimension(200,30));
        gamepanel.add(textField);

        JPanel infopanel = new JPanel();
        infopanel.setLayout(new BoxLayout(infopanel, BoxLayout.Y_AXIS));

        guesseslabel = new JLabel("You tried:");
        guesseslabel.setFont(basefont);
        infopanel.add(guesseslabel);

        trieslabel = new JLabel("Tries:");
        trieslabel.setFont(basefont);
        infopanel.add(trieslabel);

        button = new JButton("Guess");
        button.setFont(basefont);
        button.setBounds(0,40,100,50);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                update();
                textField.setText("");
            }
        });
        gamepanel.add(button);

        this.setLayout(new GridLayout(1,2));
        this.add(gamepanel);
        this.add(infopanel);
        this.setSize(800, 150);
        this.setVisible(true);
    }

    public void update(){
        game.guess = Integer.parseInt(textField.getText());
        game.guess(this);
        trieslabel.setText("Tries: " + game.tries);
    }
}
