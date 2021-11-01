import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleUI {
    static GraphicsConfiguration gc; // Class field containing config info
    public static void main(String[] args) {
    JFrame frame = new JFrame(gc); // Create a new JFrame
    frame.setSize(500,300);
    frame.setVisible(true);

        JButton but1 = new JButton("Press me");
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
            


        });




// This next line closes the program when the frame is closed
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}
