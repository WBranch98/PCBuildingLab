package PCBuild;

public class Monitor {

    private String brand;

    private  String model;

    private Dimension dimension;

    public Monitor(String brand, String model, Dimension dimension){
        this.brand=brand;
        this.model=model;
        this.dimension=dimension;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public String toString() {
        return brand + ", " + model + ", " + dimension;
    }
}

