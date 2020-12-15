package template;

/**
 * @author EricRaww
 * @create 2020-12-15
 */
public abstract class SoyaMilk {
    final void make(){
        select();
        if(customerWantCondiments()){
            add();
        }
        soak();
        beat();

    }
    void select(){
        System.out.println("to select");
    }
    abstract void add();
    void soak(){
        System.out.println("to soak");
    }
    void beat(){
        System.out.println("to beat");
    }
    boolean customerWantCondiments(){
        return true;
    }
}
