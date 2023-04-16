/**Name: Dhvani Uday Parekh
 * Branch and batch: AIML-B3
 * prn: 21070126126
 */

public class Main{
    public static void main(String[] args) {
//creating objects of different ducks
        MallardDuck md = new MallardDuck();
        RedheadDuck rd=new RedheadDuck();
        RubberDuck r=new RubberDuck();
        DecoyDuck dd=new DecoyDuck();

        //calling respective methods to know the type and their ability to swim, quack, fly
        md.display();
        md.performFly(); // Prints "It can fly"
        md.performQuack(); // "Can Quack"
        md.performSwim();//can swim

        System.out.println("--------------------------------------");

        rd.display();
        rd.performFly(); // Prints "It can fly"
        rd.performQuack();// "Can Quack"
        rd.performSwim();// can swim

        System.out.println("--------------------------------------");

        r.display();
        r.performQuack(); // "Can squeak"
        r.performFly(); //cannot fly
        r.performSwim();//can float

        System.out.println("--------------------------------------");

        dd.display();
        dd.performQuack();// "Can't Quack"
        dd.performFly();//cannot fly
        dd.performSwim();//will drown

    }
}