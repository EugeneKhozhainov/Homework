package oop;

public class Car {
    private Integer location;
    private Double consumption;
    private Double fuelTank;

    public Car(Integer location, Double consumption, Double fuelTank) {
        this.location = location;
        this.consumption = consumption;
        this.fuelTank = fuelTank;
    }

    public Integer getLocation() {
        return location;
    }

    public Double getConsumption() {
        return consumption;
    }

    public Double getFuelTank() {
        return fuelTank;
    }

    public void move(Integer km){
        location = getLocation() + km;
        Double d = consumption / 100 * km;
        if (d > fuelTank){
            throw new RuntimeException("Insufficient fuel");
        }

        fuelTank = fuelTank - d;
    }

    public void printState(){
        System.out.println(String.format("Location is = %s, Fuel value is = %s", location, fuelTank));
    }
}

