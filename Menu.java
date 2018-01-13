import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Menu {
	
	private Font font = new Font("ariel", Font.BOLD, 150);
	private Font font2 = new Font("ariel", Font.BOLD, 50);
	private Font font3 = new Font("ariel", Font.BOLD, 20);
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 1000, 500);
		
		g.setColor(Color.blue);
		g.setFont(font);
		g.drawString("Po", 300, 150);
		
		g.setColor(Color.red);
		g.drawString("ng", 500, 150);
		
		g.setColor(Color.WHITE);
		g.fillRect(400, 200, 200, 50);
		
		g.setFont(font2);
		g.setColor(Color.BLACK);
		g.drawString("Play", 450, 240);
		
		g.setColor(Color.WHITE);
		g.fillRect(400, 300, 200, 50);
		
		g.setFont(font2);
		g.setColor(Color.BLACK);
		g.drawString("Options", 400, 340);
		
		g.setColor(Color.WHITE);
		g.fillRect(400, 400, 200, 50);

		g.setFont(font2);
		g.setColor(Color.BLACK);
		g.drawString("Quit", 450, 440);
		
		g.setFont(font3);
		g.setColor(Color.BLACK);
		g.drawString("\u00a9Arthur Tran", 850, 450);
	}
}
