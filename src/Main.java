import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private void update(){

     }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel gamepanel = new JPanel();
        gamepanel.setLayout(new BoxLayout(gamepanel, BoxLayout.Y_AXIS));

        JLabel name = new JLabel("Guessing game!");
        name.setBounds(0,0,100,50);
        gamepanel.add(name);

        JLabel proccesslabel = new JLabel("Guess the number from (1-10):");
        gamepanel.add(proccesslabel);

        JTextField textField = new JTextField(1);
        gamepanel.add(textField);

        JButton button = new JButton("Click Me");
        button.setBounds(0,40,100,50);  
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        gamepanel.add(button);

        JPanel infopanel = new JPanel();
        infopanel.setLayout(new BoxLayout(infopanel, BoxLayout.Y_AXIS));

        JLabel guesseslabel = new JLabel("You tried:");
        infopanel.add(guesseslabel);

        JLabel trieslabel = new JLabel("Tries:");
        infopanel.add(trieslabel);

        frame.setLayout(new GridLayout(1,2));
        frame.add(gamepanel);
        frame.add(infopanel);
        frame.setSize(700, 500);
        frame.setVisible(true);
    }
}