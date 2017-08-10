import javax.swing.JFrame;

public class Program extends JFrame {
	
	/*
	 *  PROGRAM GAME OF LIFE 
	 */

	/**
	 * UID Serial Version
	 */
	private static final long serialVersionUID = 1L;
	private GUI gameOfLife;

	public Program() {
		setTitle("Game of Life");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		gameOfLife = new GUI(this);
		gameOfLife.initialize(this.getContentPane());

		this.setSize(1280, 720);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Program();
	}

}
