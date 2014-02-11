
import javax.swing.*;

public class Main extends JFrame{
	public Main(){
		add(new Board());
	}

	public static void main(String[] args) {
		Main frame = new Main();
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
