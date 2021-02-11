import java.awt.*;
import javax.swing.*;
public class Display extends Canvas
	{
	private static final long serialVersionUID = 1L;
	private static Color lightSQ = new Color(255, 248, 200);
	public static void displayWindow()
		{
		Display canvas = new Display();
		JFrame frame = new JFrame("Tony Hawk's Chess");
		canvas.addMouseListener(new ChessClickListener());
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(826, 849);
		frame.getContentPane().add(canvas).setBackground(lightSQ);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		}
	public void paint(Graphics graphics)
		{
		for(int i = 5; i < 800; i += 200)
			{
			for(int j = 5; j < 800; j += 200)
				{
				graphics.setColor(Color.DARK_GRAY);
				graphics.fillRect(i, j, 100, 100);
				}
			}
		for(int i = 105; i < 805; i += 200)
			{
			for(int j = 105; j < 805; j += 200)
				{
				graphics.setColor(Color.DARK_GRAY);
				graphics.fillRect(i, j, 100, 100);
				}
			}
		graphics.setColor(Color.gray);
		for(int i = 0; i < 5; i++)
			{
			graphics.drawLine(i, 810, i, 0);
			graphics.drawLine(0, i, 810, i);
			graphics.drawLine(805+i, 810, 805+i, 0);
			graphics.drawLine(0, 805+i, 810, 805+i);
			}
		}
	}
