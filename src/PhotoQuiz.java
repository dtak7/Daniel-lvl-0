
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridLayout;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		JPanel panel = new JPanel();
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 1. find an image on the internet, and put its URL in a String
		// variable (from
		// your browser, right click on the image, and select “Copy Image URL”)
		String pic = "cat.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(pic);
		panel.add(image);
		quizWindow.add(panel);
		// 4. add the image to the quiz window
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		quizWindow.setVisible(true);
		// 6. ask a question that relates to the image
		String wrong = JOptionPane.showInputDialog(null, "is there something wrong with the picture??");
		// 7. print "CORRECT" if the user gave the right answer
		if (wrong.equals("yes")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "incorect");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of
		// this until step 12)
		panel.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		String pic2 = "pen.jpg";
		Component image2;
		// 11. add the second image to the quiz window
		image2 = createImage(pic2);
		panel.add(image2);
		quizWindow.add(panel);
		// 12. pack the quiz window
		quizWindow.pack();
		quizWindow.setVisible(true);
		// 13. ask another question
		String wrong2 = JOptionPane.showInputDialog(null, "what kind of animal is this");
		// 14+ check answer, say if correct or incorrect, etc..
		System.exit(0);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		Icon icon = new ImageIcon(imageUrl);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
