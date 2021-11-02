import com.sun.org.apache.bcel.internal.generic.CHECKCAST;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    public JButton but1;
    public JButton but2;
    public JCheckBox checkbox1;
    public JRadioButton French_Button;
    public JRadioButton PlatPays_Button;
    public JRadioButton British_Button;
    public JTextField textField;
    public Canvas drawing;

    ButtonGroup group = new ButtonGroup();


    public ButtonPanel(){
        but1= new JButton("press me if your sad");
        but2= new JButton("press me if your happy");

        checkbox1 = new JCheckBox("SELECT IF YOU WANT PIZZA");

        French_Button = new JRadioButton("select if France is the best country");
        PlatPays_Button = new JRadioButton("select if Belgium is the best country");
        British_Button = new JRadioButton("select if England is the best country");

            group.add(PlatPays_Button);
            group.add(French_Button);
            group.add(British_Button);

        textField= new JTextField("Welcome to my funny UI");
        drawing= new Canvas();



        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("be Happy !!!");
            }
        });

        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clap your hands");
            }
        });

        checkbox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("go to dominos");
            }
        });

        French_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Felicitation");
            }
        });
        British_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You suck!");
            }
        });
        PlatPays_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("TU t es trompe une fois dit!");
            }
        });

            add(textField);
            add(but1);
            add(but2);
            add(checkbox1);
            add(French_Button);
            add(British_Button);
            add(PlatPays_Button);

        setLayout(new FlowLayout());

    }

}
