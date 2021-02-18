import java.awt.Color;

import javax.swing.JFrame;

//Zack Steven Haynes 5017267


public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		setTitle(Settings.WINDOW_NAME);
		setBackground(Color.WHITE);
		setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new BreakoutPanel(this);
        add(panel);
        
		setVisible(true);
	}

	public static void main(String[] args) {
		new Breakout();	
	}

}
