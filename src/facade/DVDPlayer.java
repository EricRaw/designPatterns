package facade;

/**
 * @author EricRaww
 * @create 2020-12-13
 */
public class DVDPlayer {
    private static DVDPlayer instance=new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD on");
    }
    public void off(){
        System.out.println("DVD off");
    }
    public void play(){
        System.out.println("DVD playing");
    }
}
