package factory.simplefactory.absfactoryfactory.pizza.factory;

import factory.simplefactory.absfactoryfactory.pizza.Pizza;

/**
 * @author EricRaww
 * @create 2020-11-03
 */
public interface AbstractFactory {

     Pizza createPizza(String orderType);
}
