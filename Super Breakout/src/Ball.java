import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	
	// Constructor
	public Ball() {
		setWidth(Settings.BALL_WIDTH);
		setHeight(Settings.BALL_HEIGHT);
		resetPosition();
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		x = Settings.INITIAL_BALL_X;
		y = Settings.INITIAL_BALL_Y;
	}
	
	public void update() {
		x += xVelocity;
		// TODO: Increase the y variable by yVelocity (see above)
		y += yVelocity;
		// Bounce off left side of screen
		if(x <= 0) {
			setX(0);
			setXVelocity(1); 
			// TODO: Set x to 0 so it does not leave the screen
			// TODO: Change the x velocity to make the ball go right
		}
		
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - 20) {
			setX(Settings.WINDOW_WIDTH - 20);
			setXVelocity(-1);
		}
		
		// Bounce off top of screen
		if(y <= 0) {
			setY(0);
			setYVelocity(1);
			// TODO: Change the y velocity to make the ball go downward
		}
		
	}
	
	// set velocity
	public void setXVelocity(int x) {
		xVelocity = x;
	}
	public void setYVelocity(int y) {
		yVelocity = y;
	}
	// get velocity
	public int getXVelocity() {
		return xVelocity;
	}
	public int getYVelocity() {
		return 0;
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
