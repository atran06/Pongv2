import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Setting {

	private Font font2 = new Font("ariel", Font.BOLD, 50);
	private Font font3 = new Font("ariel", Font.BOLD, 20);
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 1000, 500);
		
		g.setColor(Color.WHITE);
		g.fillRect(400, 200, 50, 50);
		
		g.setColor(Color.WHITE);
		g.fillRect(475, 200, 50, 50);
		
		g.setColor(Color.WHITE);
		g.fillRect(550, 200, 50, 50);
		
		g.setColor(Color.BLACK);
		g.setFont(font2);
		g.drawString("2", 410, 240);
		
		g.setColor(Color.BLACK);
		g.setFont(font2);
		g.drawString("3", 485, 240);
		
		g.setColor(Color.BLACK);
		g.setFont(font2);
		g.drawString("4", 560, 240);

		g.setColor(Color.white);
		g.setFont(font2);
		g.drawString("Ball Speed", 375, 150);

		g.setColor(Color.WHITE);
		g.fillRect(400, 300, 200, 50);
		
		g.setFont(font2);
		g.setColor(Color.BLACK);
		g.drawString("Back", 440, 340);
		
		g.setFont(font3);
		g.setColor(Color.BLACK);
		g.drawString("\u00a9Arthur Tran", 850, 450);
	}
}
