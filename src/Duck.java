public abstract class Duck {
    //declaring interfaces FlyBehavior, QuackBehavior and SwimBehavior
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    //method to assign the respective quack behavior upon calling
    public void performQuack() {
        quackBehavior.quack();
    }
    //method to assign the respective fly behavior upon calling
    public void performFly() {
        flyBehavior.fly();
    }
    //method to assign the respective swim behavior upon calling
    public void performSwim(){
        swimBehavior.swim();
    }
    //3 setter methods as below to assist.
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
    public void setSwimBehavior(SwimBehavior sb){
        swimBehavior = sb;
    }

}