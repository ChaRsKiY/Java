package oop;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Tiger extends Animal {
    int stripes;

    Tiger(String name, int stripes) {
        super(name);
        this.stripes = stripes;
    }

    void roar() {
        System.out.println(name + " is roaring!");
    }
}

class Crocodile extends Animal {
    int teeth;

    Crocodile(String name, int teeth) {
        super(name);
        this.teeth = teeth;
    }

    void snap() {
        System.out.println(name + " is snapping!");
    }
}

class Kangaroo extends Animal {
    int jumpHeight;

    Kangaroo(String name, int jumpHeight) {
        super(name);
        this.jumpHeight = jumpHeight;
    }

    void jump() {
        System.out.println(name + " is jumping!");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Siberian Tiger", 20);
        tiger.roar();

        Crocodile crocodile = new Crocodile("Nile Crocodile", 60);
        crocodile.snap();

        Kangaroo kangaroo = new Kangaroo("Red Kangaroo", 3);
        kangaroo.jump();
    }
}
