
package graficas;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Panel2 extends JPanel 
{
    public Panel2()
    {
        setLayout(new BorderLayout());
        add(new JButton("norte"),BorderLayout.NORTH);
        add(new JButton("sur"),BorderLayout.SOUTH);
        add(new JButton("este"),BorderLayout.WEST);
        add(new JButton("oeste"),BorderLayout.EAST);
        add(new JButton("center"),BorderLayout.CENTER);
    }
    
}
