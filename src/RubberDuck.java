public class RubberDuck extends Duck {
    //RubberDuck class inherits the abstract class Duck
    public RubberDuck(){
        //constructor where the respective fly, quack, swim behavior is assigned to the interface objects
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        swimBehavior= new Float();
    }
    public void display(){
        //method to display kind of duck
        System.out.println("Looks like a Rubber Duck");
    }
}