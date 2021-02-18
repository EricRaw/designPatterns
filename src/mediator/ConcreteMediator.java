package mediator;

import java.util.HashMap;

/**
 * @author EricRaww
 * @create 2021-02-18
 */
public class ConcreteMediator extends Mediator {
    private HashMap<String, Colleague> colleagueHashMap;
    private HashMap<String, String> interHashMap;

    public ConcreteMediator() {
        colleagueHashMap = new HashMap<>(5);
        interHashMap = new HashMap<>(5);
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interHashMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interHashMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interHashMap.put("TV", colleagueName);
        }
    }

    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        if (colleagueHashMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueHashMap.get(interHashMap
                        .get("CoffeeMachine")))).StartCoffee();
                ((TV) (colleagueHashMap.get(interHashMap.get("TV")))).StartTv();
            } else if (stateChange == 1) {
                ((TV) (colleagueHashMap.get(interHashMap.get("TV")))).StopTv();
            }
        } else if (colleagueHashMap.get(colleagueName) instanceof TV) {
        } else if (colleagueHashMap.get(colleagueName) instanceof Curtains) {
//如果是以窗帘发出的消息，这里处理...
        }


    }

    @Override
    public void SendMessage() {

    }
}
