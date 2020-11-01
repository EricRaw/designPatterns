package factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author EricRaww
 * @create 2020-11-01
 */
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza=null;
        String orderType;

//        do{
//            orderType=getType();
//            if("greek".equals(orderType)){
//                pizza=new GreekPizza();
//            }else if("cheese".equals(orderType)){
//                pizza=new CheesePizza();
//            }else if("pepper".equals(orderType)){
//                pizza=new PepperPizza();
//            }
//            else {
//                break;
//            }
//            pizza.prepare();
//            pizza.setName(orderType);
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
    }
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;

    Pizza pizza=null;
    public void setFactory(SimpleFactory simpleFactory){
        String orderType="";
        this.simpleFactory=simpleFactory;
        do{
            orderType=getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("no pizza");
                break;
            }
        }while (true);
    }

    private String getType(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please input ");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
