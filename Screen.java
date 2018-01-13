import javax.swing.JFrame;

public class Screen extends JFrame {

	private static final long serialVersionUID = 1L;

	public Screen(int width, int height, String title) {
		
		Game game = new Game();
		
		new JFrame();
		setVisible(true);
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);	
		add(game);
	
		addKeyListener(game);
		addMouseListener(new MouseInput());
	}
}
