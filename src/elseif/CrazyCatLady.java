//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String answer = JOptionPane.showInputDialog(null, "How many cats do you have?");
		// 2. Convert their answer into an int
		int cats = Integer.parseInt(answer);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (cats >= 3) {
			
		JOptionPane.showMessageDialog(null, "You are a crazy cat lady");}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below
		// to show them a cat video
		if (cats > 0 && cats < 3) {
			playVideo("https://video.search.yahoo.com/yhs/search;_ylt=Az_6winx67Zak3oAAiQPxQt.?p=cat+videos&fr=yhs-Lkry-newtab&fr2=piv-web&hspart=Lkry&hsimp=yhs-newtab&type=YHS_CTTT#id=1&vid=bee5eeb4288267a86890ed87aeb48daa&action=view");
			//playVideo("https://www.google.com");
			// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a
			// Human

		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI("videoURL");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
