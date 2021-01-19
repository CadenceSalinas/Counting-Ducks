import javax.swing.*;
import java.awt.event.*; //enables all events

public class Main
{
	public static void main (String args[])
	{
		JFrame frame1 = new JFrame("This is a JFrame");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this line is required.
		frame1.setSize(500,500);
		frame1.setVisible(true);

		//-------Button 1-----
		JButton button1 = new JButton("Click me!");

		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Yay! You clicked the button!");
			}
		}); //end the ActionListener

		//-------Button 2-----
		JButton button2 = new JButton ("No, click me");
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Thanks, pal!");
			}
		});

		frame1.add(button1);
		frame1.add(button2);

	}//end main method
}//end main class