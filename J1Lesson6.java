/**
 * Java. Level 1. Lesson 2. Example of homework
 *
 * @author Artem Ershov
 * @version dated 30, 08 , 2018
 */
class J1Lesson6 {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(200, 0, 2),
                new Dog(500, 10, 1)};
        for (Animal animal : animals) {
        System.out.println(animal + " run " + animal.runMaxDistance());
        System.out.println(animal + " swim " + animal.swimMaxDistance());
        System.out.println(animal + " jump " + animal.jumpMaxDistance());
        }
    }
}

class Cat extends Animal {
    Cat(int runMaxDistance, int swimMaxDistance, int jumpMaxDistance) {
        super(runMaxDistance, swimMaxDistance, jumpMaxDistance);
    }
    int runMaxDistance(){
        return 200;
    }
    int swimMaxDistance(){
        return 0;
    }
    int jumpMaxDistance(){
        return 2;
    }

}

class Dog extends Animal {
    Dog(int runMaxDistance, int swimMaxDistance, int jumpMaxDistance) {
        super(runMaxDistance, swimMaxDistance, jumpMaxDistance);
    }
    int runMaxDistance(){
        return 500;
    }
    int swimMaxDistance(){
        return 10;
    }
    int jumpMaxDistance(){
        return 1;
    }
}



abstract class Animal  {
    static int runMaxDistance;
    static int swimMaxDistance;
    static int jumpMaxDistance;

    Animal(int runMaxDistance,int swimMaxDistance, int jumpMaxDistance) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }


     abstract int runMaxDistance();

    abstract int swimMaxDistance();

    abstract int jumpMaxDistance();

    @Override
    public String toString(){
        return runMaxDistance + "," + swimMaxDistance + "," + jumpMaxDistance ;
    }
}
