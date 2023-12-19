package oop;

class MusicalInstrument {
    private String name;

    public MusicalInstrument(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sound() {
        System.out.println(name + " produces a sound.");
    }

    public void show() {
        System.out.println("Musical Instrument: " + name);
    }

    public void desc() {
        System.out.println("Description of " + name);
    }

    public void history() {
        System.out.println("History of " + name);
    }
}

class Violin extends MusicalInstrument {
    public Violin(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Violin: " + super.getName());
    }

    @Override
    public void sound() {
        System.out.println("The violin is playing melody.");
    }

    @Override
    public void desc() {
        System.out.println("Description of " + super.getName() + ": a classical string instrument.");
    }

    @Override
    public void history() {
        System.out.println("History of " + super.getName() + ": a long history in classical music.");
    }
}

class Trombone extends MusicalInstrument {
    public Trombone(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Trombone: " + super.getName());
    }

    @Override
    public void sound() {
        System.out.println("The trombone is producing a sound.");
    }

    @Override
    public void desc() {
        System.out.println("Description of " + super.getName() + ": a brass wind instrument.");
    }

    @Override
    public void history() {
        System.out.println("History of " + super.getName() + ": The trombone has been used in various music genres.");
    }
}

class Ukulele extends MusicalInstrument {
    public Ukulele(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Ukulele: " + super.getName());
    }

    @Override
    public void sound() {
        System.out.println("The ukulele is creating a sound.");
    }

    @Override
    public void desc() {
        System.out.println("Description of " + super.getName() + ": This is a small, four-stringed instrument.");
    }

    @Override
    public void history() {
        System.out.println("History of " + super.getName() + ": The ukulele came from Hawaii.");
    }
}

class Cello extends MusicalInstrument {
    public Cello(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Cello: " + super.getName());
    }

    @Override
    public void sound() {
        System.out.println("The cello produces a tone.");
    }

    @Override
    public void desc() {
        System.out.println("Description of " + super.getName() + ": This is a large instrument.");
    }

    @Override
    public void history() {
        System.out.println("History of " + super.getName() + ": The cello is for classical music.");
    }
}

public class Task5 {
    public static void main(String[] args) {
        Violin violin = new Violin("Violin");
        violin.show();
        violin.sound();
        violin.desc();
        violin.history();

        Trombone trombone = new Trombone("Trombone");
        trombone.show();
        trombone.sound();
        trombone.desc();
        trombone.history();

        Ukulele ukulele = new Ukulele("Ukulele");
        ukulele.show();
        ukulele.sound();
        ukulele.desc();
        ukulele.history();

        Cello cello = new Cello("Cello");
        cello.show();
        cello.sound();
        cello.desc();
        cello.history();
    }
}
