import java.awt.*;
import javax.swing.*;
public class Display extends Canvas
	{
	private static final long serialVersionUID = 1L;
	public static void displayWindow()
		{
		Canvas canvas = new Canvas();
		JFrame frame = new JFrame("ChessFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.getContentPane().add(canvas).setBackground(Color.white);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		}
	public void paint(Graphics graphics)
		{
		graphics.setColor(Color.black);
		graphics.fillRect(50, 50, 100, 100);
		}
	}
