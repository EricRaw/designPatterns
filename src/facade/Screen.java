package facade;

/**
 * @author EricRaww
 * @create 2020-12-13
 */
public class Screen {
    private static Screen instance=new Screen();
    public static Screen getInstance(){
        return instance;
    }
    public void on(){
        System.out.println("Screen on");
    }
    public void off(){
        System.out.println("Screen off");
    }
    public void play(){
        System.out.println("Screen playing");
    }
}
