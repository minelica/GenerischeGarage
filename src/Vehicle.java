public class Vehicle {
    String type;
    String model;
    double minimumGarageWidth;
    
    public Vehicle(String type, String model, double minimumGarageWidth) {
        this.type = type;
        this.model = model;
        this.minimumGarageWidth = minimumGarageWidth;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public double getMinimumGarageWidth() {
        return minimumGarageWidth;
    }
    
}
