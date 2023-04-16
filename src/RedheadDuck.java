public class RedheadDuck extends Duck {
    //RedheadDuck class inherits the abstract class Duck
    public RedheadDuck(){
        //constructor where the respective fly, quack, swim behavior is assigned to the interface objects
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior=new Swim();
    }
    public void display(){
        //method to display kind of duck
        System.out.println("Looks like a Redhead Duck");
    }
}