package factory.simplefactory;

/**
 * @author EricRaww
 * @create 2020-11-01
 */
public class SimpleFactory2 {
    public static Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza =null;
        if("greek".equals(orderType)){
            pizza=new GreekPizza();
            pizza.setName("GREEK");
        }else if("cheese".equals(orderType)){
            pizza=new CheesePizza();
            pizza.setName("CHEESE");
        }else if("pepper".equals(orderType)){
            pizza=new PepperPizza();
            pizza.setName("PEPPERR");
        }else if("guangzhou".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("guangzhou");
        }
        return pizza;

    }
}
