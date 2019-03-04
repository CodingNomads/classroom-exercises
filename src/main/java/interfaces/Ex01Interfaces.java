package interfaces;


/**
 * Create a couple of classes that have some behaviour and some specific behaviour in common
 * and extract an interface with the common behaviour.
 * <p>
 * Put all the created classes into an array and iterate calling a method from the interface.
 */

interface Vehicle {

    void accelerate(int a);
    void brake(int a);
    void changeGear(int a);

        }

class Car implements Vehicle {

    String manufacturer;
    String model;
    int currentSpeed;
    int currentGear;
    int numOfWheels;


    @Override
    public void accelerate(int increment) {
        currentSpeed += increment;
    }

    @Override
    public void brake(int decrement) {
        currentSpeed -= decrement;
    }

    @Override
    public void changeGear(int gear) {
        currentGear = gear;
        System.out.println("im a car changing gears to " + currentGear);

    }


    public Car(String manufacturer, String model, int currentSpeed, int currentGear, int numOfWheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.currentGear = currentGear;
        this.numOfWheels = numOfWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", currentGear=" + currentGear +
                ", numOfWheels=" + numOfWheels +
                '}';
    }
}

class Bike implements Vehicle {

    String manufacturer;
    String model;
    int currentSpeed;
    int currentGear;
    int numOfWheels;

    @Override
    public void accelerate(int increment) {
        currentSpeed += increment;

    }

    @Override
    public void brake(int decrement) {
        currentSpeed -= decrement;

    }

    @Override
    public void changeGear(int gear) {
        currentGear = gear;
        System.out.println("I'm a bike changing gear to " + currentGear);

    }

    public Bike(String manufacturer, String model, int currentSpeed, int currentGear, int numOfWheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.currentGear = currentGear;
        this.numOfWheels = numOfWheels;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", currentGear=" + currentGear +
                ", numOfWheels=" + numOfWheels +
                '}';
    }
}


class Controller {
    public static void main(String[] args) {
        Car car1 = new Car("Ford","Fiesta",0,0,4);
        Car car2 = new Car("Ford","Fiesta",0,0,4);
        Car car3 = new Car("Ford","Fiesta",0,0,4);
        Car car4 = new Car("Ford","Fiesta",0,0,4);
//        car.accelerate(1);
//        car.accelerate(1);
//        car.changeGear(2);
//        System.out.println(car.toString());

        Bike bike = new Bike("Honda","Some Fast Bike", 100, 3,2);
        Bike bike1 = new Bike("Honda","Some Fast Bike", 100, 3,2);
//        bike.accelerate(1);
//        bike.brake(10);
//        bike.changeGear(2);
//        System.out.println(bike.toString());

        Vehicle[] vehicleArray = new Vehicle[10];
        vehicleArray[0] = car1;
        vehicleArray[1] = car2;
        vehicleArray[2] = car3;
        vehicleArray[3] = car4;
        vehicleArray[4] = bike;
        vehicleArray[5] = bike1;

        for (int i = 0; i < 6 ; i++) {
            vehicleArray[i].changeGear(2);

        }


    }
}
