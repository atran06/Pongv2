import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {

	public void mouseClicked(MouseEvent e) {
		
	}
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		if(Game.state == Game.STATE.menu) {
			
			if(x >= 400 && x <= 600) {
				if(y >= 225 && y <= 275) {
					Game.state = Game.STATE.game;
					System.out.println("State game");
				}
			}
			if(x >= 400 && x <= 600) {
				if(y >= 425 && y <= 475) {
					System.exit(1);
				}
			}
			if(x >= 400 && x <= 600) {
				if(y >= 325 && y <= 375) {
					Game.state = Game.STATE.setting;
					System.out.println("State setting");
				}
			}
		} else if(Game.state == Game.STATE.end) {
			
			if(x >= 600 && x <= 800) {
				if(y >= 325 && y <= 375) {
					System.exit(1);
				}
			}
			if(x >= 200 && x <= 400) {
				if(y >= 325 && y <= 375) {
					Game.leftScore = 0;
					Game.rightScore = 0;
					Game.state = Game.STATE.game;
					System.out.println("State game");
				}
			}
			if(x >= 400 && x <= 600) {
				if(y >= 425 && y <= 475) {
					Game.leftScore = 0;
					Game.rightScore = 0;
					Game.state = Game.STATE.menu;
					System.out.println("State menu");
				}
			}
		} else if(Game.state == Game.STATE.game) {
			if(x >= 900 && x <= 1000) {
				if(y >= 450 && y <= 500) {
					Game.leftScore = 0;
					Game.rightScore = 0;
					Game.xBall = 100;
					Game.yBall = 100;
					Game.state = Game.STATE.menu;
				}
			}
		} else if(Game.state == Game.STATE.setting) {
			if(x >= 400 && x <= 600) {
				if(y >= 325 && y <= 375) {
					Game.state = Game.STATE.menu;
					System.out.println("State menu");
				}	
			} 
			if(x >= 400 && x <= 450) {
				if(y >= 225 && y <= 275) {
					Game.velYBall = 2;
					Game.velXBall = 2;
					System.out.println(Game.velYBall);
				}
			}	
			if(x >= 475 && x <= 525) {
				if(y >= 225 && y <= 275) {
					Game.velYBall = 3;
					Game.velXBall = 3;
					System.out.println(Game.velYBall);
				}
			}
			if(x >= 550 && x <= 600) {
				if(y >= 225 && y <= 275) {
					Game.velYBall = 4;
					Game.velXBall = 4;
					System.out.println(Game.velYBall);
				}
			}
		}
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}

}
