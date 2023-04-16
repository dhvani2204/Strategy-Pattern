public class MuteQuack implements QuackBehavior {
    // MuteQuack class implements QuackBehavior interface
    public void quack() {
        //quack method is overridden and prints respective message
        System.out.println("It cannot quack or squeak");
    }
}
