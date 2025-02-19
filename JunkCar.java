public class JunkCar extends Automobile{

    public JunkCar(int modelYear, String brand) {
        super(modelYear, brand);
    }

    public void accelerate() {
        System.out.println("The junkcar is accelerating.");
    }

    public void stop() {
        System.out.println("The junkcar has stopped.");
    }

    public void reverse() {
        System.out.println("The junkcar is reversing.");
    }

    @Override
    public void honk() {
        System.out.println("JunkCar honk: hisssss");
    }

    @Override
    public String toString() {
        return "Junkcar Model Year: " + getModelYear() + ", Junkcar Brand Name: " + getBrand();
    }
}