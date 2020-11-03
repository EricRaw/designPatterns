package factory.simplefactory.absfactoryfactory.pizza.factory;

import factory.simplefactory.absfactoryfactory.pizza.BJCheesePizza;
import factory.simplefactory.absfactoryfactory.pizza.BJPepperPizza;
import factory.simplefactory.absfactoryfactory.pizza.Pizza;

/**
 * @author EricRaww
 * @create 2020-11-03
 */
public class BJFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza= new BJCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
