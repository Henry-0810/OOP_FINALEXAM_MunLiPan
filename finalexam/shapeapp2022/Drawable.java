package finalexam.shapeapp2022;

import java.awt.*;

public interface Drawable {
    public abstract void setColour(Color color);
    public abstract void setFilled(boolean setFilled);
    public abstract Color getColour();
    public abstract boolean isFilled();
    public abstract void draw(Graphics g);
}
