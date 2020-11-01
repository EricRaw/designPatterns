package factory.simplefactory.factorymethod.order;

import factory.simplefactory.factorymethod.*;

/**
 * @author EricRaww
 * @create 2020-11-02
 */
public class UKOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza=new UKCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza= new UKPepperPizza();
        }
        return pizza;
    }
}
