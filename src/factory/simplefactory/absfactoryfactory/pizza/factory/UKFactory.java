package factory.simplefactory.absfactoryfactory.pizza.factory;

import factory.simplefactory.absfactoryfactory.pizza.*;

/**
 * @author EricRaww
 * @create 2020-11-03
 */
public class UKFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if("cheese".equals(orderType)){
            pizza= new UKCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza=new UKPepperPizza();
        }
        return pizza;
    }
}
