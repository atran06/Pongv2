import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener, KeyListener{

	private static final long serialVersionUID = 1L;
	
	private Menu menu;
	private End end;
	private Setting setting;
	public static int xBall = 100, yBall = 100, velXBall = 3, velYBall = 3;
	private int yRight = 175, velYRight = 0;
	private int yLeft = 175, velYLeft = 0;
	
	private Timer timer = new Timer(5, this);
	
	private Font font = new Font("ariel", Font.BOLD, 75);
	private Font fontScore = new Font("ariel", Font.BOLD, 25);
	
	public static int leftScore = 0, rightScore = 0;
	
	public static enum STATE {
		game,
		setting,
		menu,
		end
	};
	
	public static STATE state = STATE.menu;
	
	public Game() {
		timer.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		menu = new Menu();
		end = new End();
		setting = new Setting();
	}
	public void paintComponent(Graphics g) {
		if(state == STATE.menu) {
			menu.paintComponent(g);
		} else if(state == STATE.game) {
			if(leftScore == 5 || rightScore == 5) {
				state = STATE.end;
				if(state == STATE.end) {
					end.paintComponent(g);
					System.out.println("State end");
				}
			} else {
				g.setColor(Color.GRAY);
				g.fillRect(0, 0, 1000, 500);
					
				g.setColor(Color.BLACK);
				g.fillOval(xBall, yBall, 25, 25);
				
				g.setColor(Color.RED);
				g.fillRect(980, yRight, 10, 100);
				
				g.setColor(Color.blue);
				g.fillRect(5, yLeft, 10, 100);
					
				g.setFont(font);
				g.setColor(Color.white);
				g.drawString("Score", 390, 60);
					
				g.setFont(fontScore);
				g.setColor(Color.blue);
				g.drawString(Integer.toString(leftScore), 470, 95);
				g.setColor(Color.RED);
				g.drawString(Integer.toString(rightScore), 510, 95);
					
				g.setColor(Color.WHITE);
				g.fillRect(495, 75, 5, 20);
					
				g.fillRect(900, 450, 100, 50);
				g.setFont(fontScore);
				g.setColor(Color.black);
				g.drawString("Menu", 915, 470);
			}
		} else if(state == STATE.setting) {
			setting.paintComponent(g);
		} 
	}
	public void actionPerformed(ActionEvent e) {
		if(state == STATE.game) {
			
			if(xBall > 960 && yBall > yRight - 30 && yBall < yRight + 120) {
				velXBall = -velXBall;
			}
			if(xBall < 5 && yBall > yLeft - 30 && yBall < yLeft + 120) {
				velXBall = -velXBall;
			}
			if(yBall < 0 || yBall > 440) {
				velYBall = -velYBall;
			}
			if(yRight < 0) {
				yRight = 0;
			}
			if(yRight > 375) {
				yRight = 375;
			}
			if(yLeft < 0) {
				yLeft = 0;
			}
			if(yLeft > 375) {
				yLeft = 375;
			}
			if(xBall > 1000) {
				leftScore++;
				xBall = 100;
				yBall = 100;
			}
			if(xBall < -50) {
				rightScore++;
				xBall = 900;
				yBall = 100;
			}
			repaint();
			xBall += velXBall;
			yBall += velYBall;
			yRight += velYRight;
			yLeft += velYLeft;
		} else if(state == STATE.setting) {
			repaint();
		} else if(state == STATE.menu) {
			repaint();
		}
	}
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void keyPressed(KeyEvent e) {
		if(state == STATE.game) {
			
			int code = e.getKeyCode();
			
			if(code == KeyEvent.VK_UP) {
				velYRight = -2;
			}
			if(code == KeyEvent.VK_DOWN) {
				velYRight = 2;
			}
			if(code == KeyEvent.VK_W) {
				velYLeft = -2;
			}
			if(code == KeyEvent.VK_S) {
				velYLeft= 2;
			}
		}
	}
	public void keyReleased(KeyEvent e) {
		if(state == STATE.game) {
			
			int code = e.getKeyCode();
			
			if(code == KeyEvent.VK_UP) {
				velYRight = 0;
			}
			if(code == KeyEvent.VK_DOWN) {
				velYRight = 0;
			}
			if(code == KeyEvent.VK_W) {
				velYLeft = 0;
			}
			if(code == KeyEvent.VK_S) {
				velYLeft = 0;
			}
		}
	}
}
