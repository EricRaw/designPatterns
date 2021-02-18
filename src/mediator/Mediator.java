package mediator;

/**
 * @author EricRaww
 * @create 2021-02-18
 */
public abstract class Mediator {
    public abstract void Register(String colleagueName,Colleague colleague);

    public abstract void GetMessage(int stateChange,String colleagueName);

    public abstract void SendMessage();
}
