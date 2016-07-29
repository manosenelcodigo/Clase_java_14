
package graficas;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Marco extends JFrame  
{
    public Marco()
    {
        setBounds(300,350,600,300);
        setTitle("#manosenelcódigo");
        setVisible(true);
        add(new Panel3(),BorderLayout.SOUTH);
        add(new Panel4(),BorderLayout.CENTER);
        add(new Panel5(),BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
