

public class testGarage {
    
    public static void main(String[] args) {
        Garage<Vehicle> myGarage = new Garage<Vehicle>(4.0);
        SUV mySUV = new SUV("Porsche", "Cayenne");
        boolean parked = myGarage.parkVehicle(mySUV);
        System.out.println("mySUV is parked? " + parked);
        System.out.println("myGarage is empty? " + myGarage.isEmpty());

        Garage<Car> myCarGarage = new Garage<Car>(2.8);
        Van myVan = new Van("VW", "Sharan");
        parked = myCarGarage.parkVehicle(myVan);
        System.out.println("myVan is parked? " + parked);
        System.out.println("myCarGarage is empty? " + myCarGarage.isEmpty());
        

        Garage<Motorbike> myBikeGarage = new Garage<Motorbike>(1.8);
        Motorbike myMotorbike = new Motorbike("Ducati", "Monster");
        parked = myBikeGarage.parkVehicle(myMotorbike);
        System.out.println("myMotorbike is parked? " + parked);
        System.out.println("myBikeGarage is empty? " + myBikeGarage.isEmpty());

        Garage<Bycicle> myPedalGarage = new Garage<Bycicle>(1.0);
        Bycicle mBycicle = new Bycicle("Bergamont", "Grandurance");
        parked = myPedalGarage.parkVehicle(mBycicle);
        System.out.println("myBycicle is parked? " + parked);
        System.out.println("myPedalGarage is empty? " + myPedalGarage.isEmpty());
        
    }

}
