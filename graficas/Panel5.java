
package graficas;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Panel5  extends JPanel
{
    public Panel5()
    {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Botón 1"));
        add(new JButton("Botón2"));
    }
}
