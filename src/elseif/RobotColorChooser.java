//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Nathaniel = new Robot();
		for (int i = 0; i < 10; i++) {
			// 3. Ask the user what color they would like the robot to draw
			String color = JOptionPane.showInputDialog(null, "What color would you like the robot to draw");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (color.equals("blue")) {

				Nathaniel.setPenColor(Color.BLUE);
			} else if (color.equals("red")) {
				Nathaniel.setPenColor(Color.RED);
			}
			// 6. If the user doesn’t enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them
			else {
				Nathaniel.setRandomPenColor();
			}
			// 4. Set the pen width to 10
			Nathaniel.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			Nathaniel.penDown();
			Nathaniel.move(100);
			Nathaniel.turn(90);
			Nathaniel.move(100);
			Nathaniel.turn(90);
			Nathaniel.move(100);
			Nathaniel.turn(90);
			Nathaniel.move(100);

		}
	}
}