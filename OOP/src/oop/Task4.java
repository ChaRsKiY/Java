package oop;

class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sound() {
        System.out.println(name + " makes a sound.");
    }

    public void show() {
        System.out.println("Device: " + name);
    }

    public void desc() {
        System.out.println("Description of " + name + ": This is a device.");
    }
}

class Kettle extends Device {
    public Kettle(String name) {
        super(name);
    }

    @Override
    public void desc() {
        System.out.println("Description of " + super.getName() + ": This is a kettle.");
    }
}

class Microwave extends Device {
    public Microwave(String name) {
        super(name);
    }

    @Override
    public void desc() {
        System.out.println("Description of " + super.getName() + ": This is a microwave.");
    }
}

class Car extends Device {
    public Car(String name) {
        super(name);
    }

    @Override
    public void desc() {
        System.out.println("Description of " + super.getName() + ": This is a car.");
    }
}

class Ship extends Device {
    public Ship(String name) {
        super(name);
    }

    @Override
    public void desc() {
        System.out.println("Description of " + super.getName() + ": This is a ship.");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Kettle");
        kettle.show();
        kettle.sound();
        kettle.desc();

        Microwave microwave = new Microwave("Microwave");
        microwave.show();
        microwave.sound();
        microwave.desc();

        Car car = new Car("Car");
        car.show();
        car.sound();
        car.desc();

        Ship ship = new Ship("Ship");
        ship.show();
        ship.sound();
        ship.desc();
    }
}
