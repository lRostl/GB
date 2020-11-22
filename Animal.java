package Lesson6;

public abstract class Animal {

    protected String name;

    protected double maxRun;
    protected double maxSwim;
    protected double maxJumpOverObstacles;

    Animal(String name, double maxRun, double maxSwim, double maxJumpOverObstacles) {

        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJumpOverObstacles = maxJumpOverObstacles;
    }

    void run(double length){

        System.out.println("\n" + name + " Пробежал расстояние: " + assignedAndMax(length, maxRun));

    }
    void swim(double length){

        System.out.println(name + " Проплыл расстояние: " + assignedAndMax(length, maxSwim));

    }
    void JumpOverObstacles(double height){

        System.out.println(name + " Прыгнул на высоту: " + assignedAndMax(height, maxJumpOverObstacles));

    }

    public boolean assignedAndMax(double assigned, double max) {

        return assigned <= max;
    }
}
