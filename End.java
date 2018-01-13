import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class End {

	private Font font = new Font("ariel", Font.BOLD, 75);
	private Font font2 = new Font("ariel", Font.BOLD, 50);

	public void paintComponent(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, 0, 1000, 500);
		
		g.setFont(font);
		g.setColor(Color.white);
		
		if(Game.leftScore == 5) {
			g.drawString("Blue Wins!", 325, 250);
			
			g.setColor(Color.WHITE);
			g.fillRect(600, 300, 200, 50);
			
			g.setFont(font2);
			g.setColor(Color.BLACK);
			g.drawString("Quit", 650, 340);
			
			g.setColor(Color.WHITE);
			g.fillRect(200, 300, 200, 50);
			
			g.setFont(font2);
			g.setColor(Color.BLACK);
			g.drawString("Play", 250, 340);
			
			g.setColor(Color.WHITE);
			g.fillRect(400, 400, 200, 50);
			
			g.setFont(font2);
			g.setColor(Color.BLACK);
			g.drawString("Menu", 435, 440);
			
		} else if(Game.rightScore == 5) {
			g.drawString("Red Wins!", 325, 250);
			
			g.setColor(Color.WHITE);
			g.fillRect(600, 300, 200, 50);
			
			g.setFont(font2);
			g.setColor(Color.BLACK);
			g.drawString("Quit", 650, 340);
			
			g.setColor(Color.WHITE);
			g.fillRect(200, 300, 200, 50);
			
			g.setFont(font2);
			g.setColor(Color.BLACK);
			g.drawString("Play", 250, 340);
			
			g.setColor(Color.WHITE);
			g.fillRect(400, 400, 200, 50);
			
			g.setFont(font2);
			g.setColor(Color.BLACK);
			g.drawString("Menu", 450, 440);
		}
	}
}
