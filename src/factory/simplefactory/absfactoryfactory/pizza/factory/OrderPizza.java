package factory.simplefactory.absfactoryfactory.pizza.factory;

import factory.simplefactory.absfactoryfactory.pizza.BJCheesePizza;
import factory.simplefactory.absfactoryfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author EricRaww
 * @create 2020-11-03
 */
public class OrderPizza {
    AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory){
        setAbstractFactory(abstractFactory);
    }

    private void setAbstractFactory(AbstractFactory factory){
        Pizza pizza=null;
        String orderType="";
        this.abstractFactory=factory;
        do{
            orderType=getType();
            pizza=factory.createPizza(orderType);
            if(pizza !=null){
                pizza.setName(orderType);
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);

    }
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please input ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
