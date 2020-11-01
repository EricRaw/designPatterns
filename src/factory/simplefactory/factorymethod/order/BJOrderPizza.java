package factory.simplefactory.factorymethod.order;

import factory.simplefactory.factorymethod.BJCheesePizza;
import factory.simplefactory.factorymethod.BJPepperPizza;
import factory.simplefactory.factorymethod.Pizza;

/**
 * @author EricRaww
 * @create 2020-11-02
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza=new BJCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza= new BJPepperPizza();
        }
        return pizza;
    }
}
