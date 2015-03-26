import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D;


public class TriangleComponent extends JComponent

{
    private int x;
    private int y;
    private ArrayList<Point> points =  new ArrayList<Point>();
    
    
    class Point
    {
        private int x;
        private int y;
        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
            
        }
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle point = new Rectangle(this.x, this.y, 2, 2);
        g2.setColor(BLACK);
        g2.fill(point);
        
        
        
        
       
        
       
    }

}