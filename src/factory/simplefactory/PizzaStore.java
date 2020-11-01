package factory.simplefactory;

/**
 * @author EricRaww
 * @create 2020-11-01
 * 简单工厂模式
 * 优点：简单易操作
 * 缺点：违反了OCP原则，对拓展开放，对修改关闭
 */
public class PizzaStore {
    public static void main(String[] args) {
//        OrderPizza orderPizza = new OrderPizza();
//        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
        new OrderPizza2();

    }
}
