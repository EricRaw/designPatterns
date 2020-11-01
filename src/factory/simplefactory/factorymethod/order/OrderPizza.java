package factory.simplefactory.factorymethod.order;

import factory.simplefactory.Pizza;
import factory.simplefactory.SimpleFactory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author EricRaww
 * @create 2020-11-01
 */
public abstract class OrderPizza {

    /**
     * 定义一个抽象方法，createPizza
     */
    abstract factory.simplefactory.factorymethod.Pizza createPizza(String orderType);

    public OrderPizza() {
        factory.simplefactory.factorymethod.Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.setName(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
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
