import java.awt.*;
import java.awt.geom.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Class BallDemo - provides two short demonstrations showing how to use the 
 * Canvas class. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private int width;
    private int height;
    private int thickness;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        thickness = 0;
        width = 600;
        height = 500;
        myCanvas = new Canvas("Ball Demo", width, height);
        myCanvas.setVisible(true);
    }
 
    /**
     * Demonstrate some of the drawing operations that are
     * available on a Canvas object.
     */
    public void drawDemo()
    {
        myCanvas.setFont(new Font("helvetica", Font.BOLD, 14));
        myCanvas.setForegroundColor(Color.red);

        myCanvas.drawString("We can draw text, ...", 20, 30);
        myCanvas.wait(1000);

        myCanvas.setForegroundColor(Color.black);
        myCanvas.drawString("...draw lines...", 60, 60);
        myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.gray);
        myCanvas.drawLine(200, 20, 300, 50);
        myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(220, 100, 370, 40);
        myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.green);
        myCanvas.drawLine(290, 10, 320, 120);
        myCanvas.wait(1000);

        myCanvas.setForegroundColor(Color.gray);
        myCanvas.drawString("...and shapes!", 110, 90);

        myCanvas.setForegroundColor(Color.red);

        // the shape to draw and move
        int xPos = 10;
        Rectangle rect = new Rectangle(xPos, 150, 30, 20);

        // move the rectangle across the screen
        for(int i = 0; i < 200; i ++) {
            myCanvas.fill(rect);
            myCanvas.wait(10);
            myCanvas.erase(rect);
            xPos++;
            rect.setLocation(xPos, 150);
        }
        // at the end of the move, draw once more so that it remains visible
        myCanvas.fill(rect);
    }

    /**
     * Simulate two bouncing balls
     */
    public void bounce()
    {
        int ground = 400;   // position of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.drawLine(50, ground, 550, ground);

        // crate and show the balls
        BouncingBall ball = new BouncingBall(50, 50, 16, Color.blue, ground, myCanvas);
        ball.draw();
        BouncingBall ball2 = new BouncingBall(70, 80, 20, Color.red, ground, myCanvas);
        ball2.draw();

        // make them bounce
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            ball.move();
            ball2.move();
            // stop once ball has travelled a certain distance on x axis
            if(ball.getXPosition() >= 550 && ball2.getXPosition() >= 550) {
                finished = true;
            }
        }
        ball.erase();
        ball2.erase();
    }
    
    public void drawFrame()
    {
        thickness = 20;
        Rectangle rect = new Rectangle(0, 0, width, thickness);
        myCanvas.fill(rect);
        rect = new Rectangle(0, height - thickness, width, height);
        myCanvas.fill(rect);
        rect = new Rectangle(width - thickness, thickness, width, height - thickness);
        myCanvas.fill(rect);
        rect = new Rectangle(0, thickness, thickness, height - thickness);
        myCanvas.fill(rect);
    }
    
    public void boxBounce()
    {
        int ball = 2;
        int bottom = thickness;
        int up = height - thickness;
        int right = width - thickness;
        int left = thickness;
        
        int diameter = 16;
        int diameter2 = 20;
        
        int xmin = left;
        int xmax = right - diameter + 1;
        int ymin = bottom + diameter;
        int ymax = up - diameter + 1;
        int xmin2 = left + diameter2;
        int xmax2 = right - diameter2 + 1;
        int ymin2 = bottom + diameter2;
        int ymax2 = up - diameter2 + 1;
        
        int x1 = ThreadLocalRandom.current().nextInt(xmin, xmax);
        int y1 = ThreadLocalRandom.current().nextInt(ymin, ymax);
        int x2 = ThreadLocalRandom.current().nextInt(xmin, xmax);
        int y2 = ThreadLocalRandom.current().nextInt(ymin, ymax);
        while(x1 == x2 && y1 == y2){
            x2 = ThreadLocalRandom.current().nextInt(xmin, xmax);
            y2 = ThreadLocalRandom.current().nextInt(ymin, ymax);
        }
        
        Color color1 = new Color(ThreadLocalRandom.current().nextInt(256), ThreadLocalRandom.current().nextInt(256), ThreadLocalRandom.current().nextInt(256));
        Color color2 = new Color(ThreadLocalRandom.current().nextInt(256), ThreadLocalRandom.current().nextInt(256), ThreadLocalRandom.current().nextInt(256));
        
        myCanvas.setVisible(true);
        drawFrame();
        // crate and show the balls
        BoxBall ball = new BouncingBall(x1, y1, diameter, color1, bottom, up, left, right, myCanvas);
        ball.draw();
        BoxgBall ball2 = new BouncingBall(x2, y2, diameter, color2,bottom, up, left, right, myCanvas);
        ball2.draw();

        // make them bounce
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            ball.move();
            ball2.move();
            // stop once ball has travelled a certain distance on x axis
            if(ball.getXPosition() >= 550 && ball2.getXPosition() >= 550) {
                finished = true;
            }
        }
        ball.erase();
        ball2.erase();
    }
}
