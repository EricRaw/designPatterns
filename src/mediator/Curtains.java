package mediator;

/**
 * @author EricRaww
 * @create 2021-02-18
 */
public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange,this.name);
    }
    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }

}
