package Lesson6;

public class Dog extends Animal{

    Dog(String name, double maxRun, double maxSwim, double maxJumpOverObstacles ) {

        super(name, maxRun, maxSwim, maxJumpOverObstacles);

    }

    void maxRan(int x){ x = 200;}

    void maxJumpOverObstacles(double y){ y = 0.5; }

    void maxSwim(int q){ q = 10; }
}
