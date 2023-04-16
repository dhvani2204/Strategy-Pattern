# Strategy-Pattern
1) An application to show the behavior of a Duck.
2) Created 3 Behaviors :

i)To know SwimBehavior
               a) <<interface>> SwimBehavior
               b) Three different classes  Swim, Float, and Drown which implement SwimBehavior containing swim() method.
 
ii)To know QuackBehavior
               a) <<interface>> QuackBehavior
               b) Three different classes  quack, squeak, and MuteQuack which implement QuackBehavior containing quack() method.
iii)To know SwimBehavior
               a) <<interface>> FlyBehavior
               b) Two different classes  FlyWithWings, FlyNoWay which implement FlyBehavior containing fly() method.         
               
3) Printed which duck will fly, quack or swim by creating objects of MallardDuck, RedHeadDuck,  RubberDuck, DecoyDuck classes and calling the repective methods performSwim(), 
performQuack(), and performFly() in Main class.

4)A duck abstract class contains the interface objects and calls the abstract methods fly, swim, quack 

5)MallardDuck, RedHeadDuck,  RubberDuck, DecoyDuck classes extend the duck class and which call the behavior methods for each duck.
