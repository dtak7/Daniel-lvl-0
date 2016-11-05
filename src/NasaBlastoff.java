import javax.swing.JOptionPane;

public class NasaBlastoff {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		String hi=JOptionPane.showInputDialog("WHEN WILL YOU BLASTOFF");
		// 3. convert the user's answer to an int (Integer.parseInt)
int o= Integer.parseInt(hi);
	


		// 4. countdown from user's starting point 
for  ( int a=o; a>0; a--){
	System.out.println(a);speak (Integer.toString(a)); 
}
	

	

		// 1. countdown from 10 to 0


		// 5. when the counting is done, print "blastoff!"
	speak("BLASTOFF");

}
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}





