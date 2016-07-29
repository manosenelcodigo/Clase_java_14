
package graficas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Panel4 extends JPanel 
{

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        File file=new File("src/images/logo.png");
        try {
            Image imagen=ImageIO.read(file);
            g2.drawImage(imagen, 200,0,null);
        } catch (IOException ex) {
            System.out.println("la imagen no existe");
        }
        
    }
    
}
