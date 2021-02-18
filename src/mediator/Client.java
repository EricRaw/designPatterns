package mediator;

/**
 * @author EricRaww
 * @create 2021-02-18
 */
public class Client {
    public static void main(String[] args) {
       Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "CoffeeMachine");
        Curtains curtains = new Curtains(mediator, "Curtains");
        TV tv = new TV(mediator, "TV");
        alarm.SendMessage(0);
        coffeeMachine.FinishCoffee();
        alarm.SendMessage(1);

    }
}
