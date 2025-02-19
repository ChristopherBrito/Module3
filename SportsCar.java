public class SportsCar extends Automobile{

    public SportsCar(int modelYear, String brand) {
        super(modelYear, brand);
    }

    public void accelerate() {
        System.out.println("The sportscar is accelerating.");
    }

    public void stop() {
        System.out.println("The sportscar has stopped.");
    }

    public void reverse() {
        System.out.println("The sportscar is reversing.");
    }

    @Override
    public void honk() {
        System.out.println("SportsCar honk: Beeeeeeeeeeeeep!!!");
    }

    @Override
    public String toString() {
        return "Sportscar Model Year: " + getModelYear() + ", Sportscar Brand name: " + getBrand();
    }
    
}