import java.awt.*;
import javax.swing.*;

public class madeWithLoveBy {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel madeWith = new JLabel("Made with ");
        madeWith.setFont(new Font("Unicode Block", Font.PLAIN, 16));
        JLabel love = new JLabel("❤");
        love.setForeground(Color.RED);
        love.setFont(new Font("Unicode Block", Font.PLAIN, 16));
        JLabel madeBy = new JLabel(" by cubeflix");
        madeBy.setFont(new Font("Unicode Block", Font.PLAIN, 16));
        frame.getContentPane().add(madeWith, BorderLayout.WEST);
        frame.getContentPane().add(love, BorderLayout.CENTER);
        frame.getContentPane().add(madeBy, BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
