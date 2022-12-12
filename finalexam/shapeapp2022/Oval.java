package finalexam.shapeapp2022;

import java.awt.*;

public class Oval extends AbstractShape implements  Drawable{
    private Color colour;
    private boolean filled;

    public Oval(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY, Color colour, boolean filled) {
        super(topLeftX, topLeftY, bottomRightX, bottomRightY);
        setColour(colour);
        setFilled(filled);
    }

    @Override
    public String toString() {
        String bool;
        if(isFilled()) bool = "yes";
        else bool = "no";

        return "Type: " + getType() + "\n" + super.toString() + "\nColor: " + getColour() + "\nFilled: " + bool;
    }

    @Override
    public String getType() {
        return "Oval";
    }

    @Override
    public void setColour(Color color) {
        colour = color;
    }

    @Override
    public void setFilled(boolean setFilled) {
        filled = setFilled;
    }

    @Override
    public Color getColour() {
        return colour;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(colour);

        if(!filled)
            g.drawOval(getTopLeftX(), getTopLeftY(), getWidth(), getHeight());
        else
            g.fillOval(getTopLeftX(), getTopLeftY(), getWidth(), getHeight());
    }

}
