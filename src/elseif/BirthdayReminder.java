
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "December 1st";
		String dadsBirthday = "May 9th";
		String nathanBirthday = "October 24th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String Birthday = JOptionPane.showInputDialog(null, "Which birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(Birthday);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (Birthday.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		else if (Birthday.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		else if (Birthday.equals("nathan")) {
			JOptionPane.showMessageDialog(null, nathanBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remeber that person's birthday.");
		}
	}
}
