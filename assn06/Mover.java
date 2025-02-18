import java.awt.Graphics;

public class Mover{
    private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite;


    public Mover(int startX, int startY, Sprite sprite){
        x = startX;
        y = startY;
        this.sprite = sprite;
    }

    public void setMovementVector(int xIncrement, int yIncrement){
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    public void drawBouncer(Graphics surface){
        sprite.draw(surface, x, y);

        x += xDirection;
        y += yDirection;

        if ((x <= 0 && xDirection < 0) ||
                (x + sprite.getWidth() >= SimpleDraw.WIDTH && xDirection > 0)) {
            xDirection = -xDirection;
        }
        if ((y <= 0 && yDirection < 0) ||
                (y + sprite.getHeight() >= SimpleDraw.HEIGHT && yDirection > 0)) {
            yDirection = -yDirection;
        }
    }

    public void drawStraight(Graphics surface){
        sprite.draw(surface,x, y);

        x += xDirection;
        y += yDirection;       
    }
}