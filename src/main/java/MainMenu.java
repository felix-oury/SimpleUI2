import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// MainMenu is a JMenuBar that also implements the ActionListener interface by
// having a concrete actionPerformed method
public class MainMenu extends JMenuBar implements ActionListener {
    JMenu menu; // One menu
    JMenuItem item;// Which has one item
    public MainMenu(){
            menu=new JMenu("The Menu");
            item=new JMenuItem("Item 1");
            item.addActionListener(this);
            add(menu);// Add the JMenu to the JMenuBar
            menu.add(item);// Add the JMenuItem to the JMenu
            setLayout(new FlowLayout());

    }
    @Override

    // If 'this' is set as the ActionListener to all menu items, this method will // be called whenever any menu item is selected, but the ActionEvent
    // command will be the text of the menu item selected
    public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
        }
}