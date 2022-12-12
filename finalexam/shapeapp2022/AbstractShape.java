package finalexam.shapeapp2022;

public abstract class AbstractShape {
    private int topLeftX;
    private int topLeftY;
    private int bottomRightX;
    private int bottomRightY;

    public AbstractShape(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        setTopLeftX(topLeftX);
        setTopLeftY(topLeftY);
        setBottomRightX(bottomRightX);
        setBottomRightY(bottomRightY);
    }

    public int getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(int topLeftX) {
        this.topLeftX = topLeftX;
    }

    public int getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(int topLeftY) {
        this.topLeftY = topLeftY;
    }

    public int getBottomRightX() {
        return bottomRightX;
    }

    public void setBottomRightX(int bottomRightX) {
        this.bottomRightX = bottomRightX;
    }

    public int getBottomRightY() {
        return bottomRightY;
    }

    public void setBottomRightY(int bottomRightY) {
        this.bottomRightY = bottomRightY;
    }

    public int getWidth(){
        int diff = getTopLeftX() - getBottomRightX();
        return Math.abs(diff);
    }

    public int getHeight(){
        int diff = getTopLeftY() - getBottomRightY();
        return Math.abs(diff);
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Top-left coordinates: (" + getTopLeftX() + "," + getTopLeftY() + ")\nBottom-right coordinates: (" +
                getBottomRightX() + "," + getBottomRightY() + ")\nWidth: " + getWidth() + "\nHeight: " + getHeight();
    }
}
