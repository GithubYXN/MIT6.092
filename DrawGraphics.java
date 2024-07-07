import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> array = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        BouncingBox box1 = new BouncingBox(200, 50, Color.RED);
        BouncingBox box2 = new BouncingBox(200, 50, Color.BLUE);
        BouncingBox box3 = new BouncingBox(200, 50, Color.GREEN);

        array.add(box1);
        array.add(box2);
        array.add(box3);

        box1.setMovementVector(1, 4);
        box2.setMovementVector(0, -4);
        box3.setMovementVector(6, 2);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawRect(30, 30, 10, 20);
        surface.drawString("This is a test String!", 180, 25);
        surface.drawArc(100, 250, 50, 50, 0, 90);

        for(BouncingBox box : array){
            box.draw(surface);
        }

    }
} 