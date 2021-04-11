package strategy;

/**
 * @author EricRaww
 * @create 2021-04-11
 */
public abstract class Duck {
    /**
     * 属性，策略接口
     */
    FlyBehavior flyBehavior;

    public Duck() {

    }
    public abstract void display();

    public  void fly(){
        if(flyBehavior !=null){
            flyBehavior.fly();
        }
    }

    /**
     * 可以通过此方法动态更新策略
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
