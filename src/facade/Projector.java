package facade;

/**
 * @author EricRaww
 * @create 2020-12-13
 */
public class Projector {
    private static Projector instance=new Projector();
    public static Projector getInstance(){
        return instance;
    }
    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector off");
    }
    public void play(){
        System.out.println("Projector playing");
    }
}
