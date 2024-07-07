import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    // Bouncer movingSprite;

    ArrayList<Mover> movers = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        // Rectangle box = new Rectangle(15, 20, Color.RED);
        // movingSprite = new Bouncer(100, 170, box);
        // movingSprite.setMovementVector(3, 1);

        Rectangle rec = new Rectangle(15, 20, Color.RED);
        movers.add(new Mover(100, 170, rec));
        movers.get(0).setMovementVector(3, 1);
    

        Oval oval = new Oval(15, 20, Color.YELLOW);
        movers.add(new Mover(0, 100, oval));
        movers.get(1).setMovementVector(5, -2);
        
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        // shapes.get(0).draw(surface);
        for(Mover mover : movers){
            mover.drawStraight(surface);
            mover.drawBouncer(surface);
            
        }
    }
}
