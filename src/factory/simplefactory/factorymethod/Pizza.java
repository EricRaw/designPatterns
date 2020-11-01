package factory.simplefactory.factorymethod;

/**
 * @author EricRaww
 * @create 2020-11-01
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();
    public void bake(){
        System.out.println(name+" baking");
    }
    public void cut(){
        System.out.println(name+" cutting");
    }
    public void box(){
        System.out.println(name+" boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
