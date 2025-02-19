    public class Tester {
        
    public static void main(String[] args) {
        
        Automobile car1 = new Car(2018, "Toyota");
        Automobile sportsCar1 = new SportsCar(2025, "Lamborghini");
        Automobile junkCar1 = new JunkCar(1983, "A broken honda");

        Automobile[] automobiles = { car1, sportsCar1, junkCar1 };

        for (Automobile automobile : automobiles) {
            System.out.println(automobile.toString());
            automobile.honk();
            
            if (automobile instanceof Car) {
                ((Car) automobile).accelerate();
                ((Car) automobile).stop();
                ((Car) automobile).reverse();
                
            } else if (automobile instanceof SportsCar) {
                ((SportsCar) automobile).accelerate();
                ((SportsCar) automobile).stop();
                ((SportsCar) automobile).reverse();
                
            } else if (automobile instanceof JunkCar) {
                ((JunkCar) automobile).accelerate();
                ((JunkCar) automobile).stop();
                ((JunkCar) automobile).reverse();
            }
            System.out.println();
        }
        
        System.out.println("Car1 and SportsCar1 equal: "+ car1.equals(sportsCar1));
        System.out.println("Car1 and JunkCar1 equal: " + car1.equals(junkCar1));
    }
    
}
