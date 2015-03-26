import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
 
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JLabel label;
            
    public ButtonViewer()
    {
        frame = new JFrame();
        panel = new JPanel();
        button1 = new JButton("Doris Pringle Brule");
        button2 = new JButton("Mobin");
        label = new JLabel("I don't like anyone.");
        panel.add(button1);
        panel.add(button2);
        panel.add(label);
        
        frame.add(panel);
        
        ClickListener listener = new ClickListener();
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonViewer bttnVieweer = new ButtonViewer();
        
    }
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            
            label.setText("I like " + event.getActionCommand() + " now.");
                
        }
    }

}