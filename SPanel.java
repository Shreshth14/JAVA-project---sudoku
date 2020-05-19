import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;

public class SPanel extends Panel   //create border panels for the display
{
    private static final long serialVersionUID = 1L;
    Color WS = new Color(0xf5, 0xf5, 0xf5);  //White Smoke background 	
    public SPanel(Dimension set) 
    {
       super();  //construct the panel
       this.setBackground(WS);
       this.setPreferredSize(set);
    }
}