package oop;

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Builder extends Human {
    private String constructionSkill;

    public Builder(String name, int age, String constructionSkill) {
        super(name, age);
        this.constructionSkill = constructionSkill;
    }

    public void build() {
        System.out.println(getName() + " is building with skill: " + constructionSkill);
    }
}

class Sailor extends Human {
    private String navigationSkill;

    public Sailor(String name, int age, String navigationSkill) {
        super(name, age);
        this.navigationSkill = navigationSkill;
    }

    public void sail() {
        System.out.println(getName() + " is sailing with skill: " + navigationSkill);
    }
}

class Pilot extends Human {
    private String flyingSkill;

    public Pilot(String name, int age, String flyingSkill) {
        super(name, age);
        this.flyingSkill = flyingSkill;
    }

    public void fly() {
        System.out.println(getName() + " is flying with skill: " + flyingSkill);
    }
}

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("John", 30, "Carpentry");
        builder.build();

        Sailor sailor = new Sailor("Alice", 25, "Navigation");
        sailor.sail();

        Pilot pilot = new Pilot("Bob", 35, "Aviation");
        pilot.fly();
    }
}
