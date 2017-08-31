
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
		 GridLayout Layout = new GridLayout(2,2);
		 panel.setLayout(Layout);
		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image URL”)
		String pic = "https://cuteoverload.files.wordpress.com/2010/03/screen-shot-2010-03-16-at-1-53-00-pm.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(pic);
		panel.add(image);
		quizWindow.add(panel);
		// 4. add the image to the quiz window
		//quizWindow.setSize(image.getWidth(), image.getHeight());
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		quizWindow.setVisible(true);
		// 6. ask a question that relates to the image
		String wrong = JOptionPane.showInputDialog("is there something wrong with the picture??");
		// 7. print "CORRECT" if the user gave the right answer
		if (wrong.equals("yes")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "incorect");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
		String pic2 ="https://petapixel.com/assets/uploads/2014/11/penguitten-Edit.jpg";
		 Component image2;
		// 11. add the second image to the quiz window
		 image2 = createImage(pic2);
		 panel.add(image2);
		// 12. pack the quiz window
		 
		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc..

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
