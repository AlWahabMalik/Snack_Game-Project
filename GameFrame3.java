import javax.swing.JFrame;

public class GameFrame3 extends JFrame {

	GameFrame3() {

		this.add(new GamePanel3());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

	}

	public static void main(String[] args) {

		new GameFrame3();
	}
}