package factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author EricRaww
 * @create 2020-11-01
 */
public class OrderPizza2 {
    Pizza pizza=null;
    String orderType="";
    public OrderPizza2(){
        do{
            orderType=getType();
            pizza=SimpleFactory2.createPizza(orderType);
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
