public class DecoyDuck extends Duck {
//DecoyDuck class inherits the abstract class Duck
    public DecoyDuck(){
        //constructor where the respective fly, quack, swim behavior is assigned to the interface objects
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
        swimBehavior=new Drown();
    }
    public void display(){
        //method to display kind of duck
        System.out.println("Looks like a Decoy Duck");
    }
}