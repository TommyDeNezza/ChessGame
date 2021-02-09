import java.awt.*;
import javax.swing.*;
public class Display extends Canvas
	{
	private static final long serialVersionUID = 1L;
	public static void displayWindow()
		{
		Display canvas = new Display();
		JFrame frame = new JFrame("ChessFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 900);
		frame.getContentPane().add(canvas).setBackground(Color.white);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		}
	public void paint(Graphics graphics)
		{
		for(int i = 33; i < 800; i += 200)
			{
			for(int j = 728; j > 0; j-=200)
				{
				graphics.setColor(Color.black);
				graphics.fillRect(i, j, 100, 100);
				}
			}
		for(int i = 133; i < 800; i += 200)
			{
			for(int j = 628; j > 0; j-=200)
				{
				graphics.setColor(Color.black);
				graphics.fillRect(i, j, 100, 100);
				}
			}
		graphics.setColor(Color.gray);
		for(int i = 28; i < 34; i++)
			{
			for(int j = 23; j < 29; j++)
				{
				graphics.drawLine(i, 828, i, 28);
				//graphics.drawLine(33, 828, 833, 828);
				//graphics.drawLine(833, 828, 833, 28);
				//graphics.drawLine(33, 28, 833, 28);
				}
			}
        
		}
	}
