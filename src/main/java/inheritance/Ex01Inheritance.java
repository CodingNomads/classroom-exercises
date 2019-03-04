package inheritance;

/**
 * Create some classes to represent different vehicles.
 * The parent class should have some methods that are common to all vehicles
 * The subclasses should have behaviour that is specific to that class.
 * Override some methods in the subclasses to make them behave different than in the parent class.
 */

class Vehicles {

    public int currentSpeed;
    public int currentGear;

    @Override
    public String toString() {
        return "Vehicles{" +
                "currentSpeed=" + currentSpeed +
                ", currentGear=" + currentGear +
                '}';
    }

    public Vehicles(int currentSpeed, int currentGear) {
        this.currentSpeed = currentSpeed;
        this.currentGear = currentGear;
    }


    public void accelerate(int a) {
        currentSpeed = currentSpeed + a;
    }

    public void brake(int a) {
        currentSpeed = currentSpeed - a;
    }

    public void gearUp(int a) {
        currentGear = currentGear + a;
    }

    public void gearDown(int a) {
        currentGear = currentGear - a;
    }


}

class Car extends Vehicles {

    private String manufacturer;
    private String model;
    private int price;

    public Car(int currentSpeed, int currentGear, String manufacturer, String model, int price) {
        super(currentSpeed, currentGear);
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    @Override
    public void accelerate(int a) {
        super.accelerate(a);
        currentSpeed = currentSpeed + a;
    }

    @Override
    public void brake(int a) {
        super.brake(a);
        currentSpeed = currentSpeed - a;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

class Bike extends Vehicles {

    private String manufacturer;
    private String model;
    private int numOfWheels;
    private int numOfPassengers;

    public Bike(int currentSpeed, int currentGear, String manufacturer, String model, int numOfWheels, int numOfPassengers) {
        super(currentSpeed, currentGear);
        this.manufacturer = manufacturer;
        this.model = model;
        this.numOfWheels = numOfWheels;
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "currentSpeed=" + currentSpeed +
                ", currentGear=" + currentGear +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", numOfWheels=" + numOfWheels +
                ", numOfPassengers=" + numOfPassengers +
                '}';
    }
}


class Controller {
    public static void main(String[] args) {

        Car car = new Car(0, 0, "Mercedes-Benz", "A45", 50000);
        car.accelerate(1); // Calling overriden method
        car.gearUp(1); // Calling super method
        car.accelerate(2);
        car.gearUp(1);
        System.out.println(car.toString());
        car.gearDown(1);
        System.out.println(car.toString());

        Bike bike = new Bike(0,0,"Honda","some fast bike",2,1);
        System.out.println(bike);
        bike.accelerate(1);
        bike.gearUp(1);
        bike.accelerate(1);
        bike.gearUp(1);
        System.out.println(bike);

    }
}
