public class Car extends Automobile{
    
    public Car(int modelYear, String brand) {
        super(modelYear, brand);
    }

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    public void stop() {
        System.out.println("The car has stopped.");
    }

    public void reverse() {
        System.out.println("The car is reversing.");
    }

    @Override
    public void honk() {
        System.out.println("Car honk: Beep!");
    }

    @Override
    public String toString() {
        return "Car Model Year: " + getModelYear() + ", Car Brand name: " + getBrand();
    }   
}