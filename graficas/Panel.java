
package graficas;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Panel extends JPanel {
    
    public Panel()
    {
        setLayout(new FlowLayout(FlowLayout.RIGHT,100,10));
        add(new JButton("botón 1"));
        add(new JButton("botón 2"));
    }
}
