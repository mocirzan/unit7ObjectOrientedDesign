import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;
 
public class TriangleViewer 
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JLabel label;
    
            
    public TriangleViewer()
    {
        frame = new JFrame();
  
        ClickListener listener = new ClickListener();
     
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TriangleComponent tComp = TriangleComponent();
        frame.add(tComp);
        
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        TriangleViewer view = new TriangleViewer();
        
    }
    
  
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            
            Pixel pix = new Pixel(90,90)
                
        }
    }

}