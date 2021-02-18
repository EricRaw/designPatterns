package mediator;

/**
 * @author EricRaww
 * @create 2021-02-18
 */
public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange,this.name);
    }
    public void StartCoffee(){
        System.out.println("starting for coffee");
    }
    public void FinishCoffee(){
        System.out.println("Coffee done");
        SendMessage(0);
    }
}
