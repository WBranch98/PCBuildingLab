package PCBuild;

public class Dimension {
    private double width;

    private double height;

    private double depth;

    public Dimension(){
        width=10;
        height=20;
        depth=19;
}

public Dimension(double w, double h, double d){
    this.width=w;
    this.height=h;
    this.depth=d;
}

public double getWidth(){
    return width;
}
    public void setWidth(double width) {

        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public double getDepth() {

        return depth;
    }

    public void setDepth(double depth) {

        this.depth = depth;
    }

    public String toString(){

        return width + " x " + height + " x " + depth;
    }
}
