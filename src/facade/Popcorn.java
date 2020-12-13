package facade;

/**
 * @author EricRaww
 * @create 2020-12-13
 */
public class Popcorn {
    private static Popcorn instance=new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }
    public void on(){
        System.out.println("Popcorn on");
    }
    public void off(){
        System.out.println("Popcorn off");
    }
    public void play(){
        System.out.println("Popcorn playing");
    }
}
