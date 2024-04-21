public class Garage<T extends Vehicle> {

    public double width;
    private T occupier;

    public Garage(double width) {
        this.width = width;
    }

    public boolean isEmpty() {
        if (occupier == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean parkVehicle(T vehicle) {
        if (this.isEmpty() && vehicle.minimumGarageWidth < this.width) {
            setOccupier(vehicle);
            return true;
        } else {
            return false;
        }
    }

    public double getWidth() {
        return width;
    } 

    public void setWidth(double width) {
        this.width = width;
    }

    public T getOccupier() {
        return occupier;
    } 

    public void setOccupier(T occupier) {
        this.occupier = occupier;
    }
}