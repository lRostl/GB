package Lesson6;

public class Cat extends Animal{

    Cat (String name, double maxRun, double maxJumpOverObstacles ) {

        super(name, maxRun, 0, maxJumpOverObstacles);

    }


    @Override

    void swim(double length){

        System.out.print(name + " Не умеет плавать. \n");

    }
}
