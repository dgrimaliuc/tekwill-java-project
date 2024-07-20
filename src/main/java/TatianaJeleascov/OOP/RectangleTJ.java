package main.java.TatianaJeleascov.OOP;

public class RectangleTJ extends ShapeTJ{
    private int weightRect;
    private int heightRect;

    public RectangleTJ(String colorShape, int weightRect, int heightRect) {
        super(colorShape);
        this.weightRect = weightRect;
        this.heightRect = heightRect;
    }

    public int getWeightRect() {
        return weightRect;
    }

    public void setWeightRect(int weightRect) {
        this.weightRect = weightRect;
    }

    public int getHeightRect() {
        return heightRect;
    }

    public void setHeightRect(int heightRect) {
        this.heightRect = heightRect;
    }
}
