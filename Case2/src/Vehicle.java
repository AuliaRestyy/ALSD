public class Vehicle {
    String plateNum;
    String type;
    String brand;
    Boolean isVvip;

    public Vehicle(Vehicle vhc) {

    }

    public Vehicle(String plateNum, String type, String brand, boolean isVvip) {
        this.plateNum = plateNum;
        this.type = type;
        this.brand = brand;
        this.isVvip = isVvip;
    }

    void print() {
        System.out.println("Number Plate:" + plateNum);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }

}