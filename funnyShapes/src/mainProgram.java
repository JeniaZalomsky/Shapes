import javax.swing.JFrame;

public class mainProgram {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		DrawPanel dp = new DrawPanel();
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(dp);
		f.setSize(500, 500);
		f.setLocation(200,100);
		f.setVisible(true);
	}

}
