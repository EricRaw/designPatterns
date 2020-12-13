package facade;

/**
 * @author EricRaww
 * @create 2020-12-13
 */
public class HomeTheaterFacade {
    /**
     * 定义各个子系统对象
     */
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;

    /**
     * 构造器
     */
    public HomeTheaterFacade() {
        super();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
    }

    public void ready(){
        dvdPlayer.on();
        popcorn.on();
        projector.on();
        screen.on();
    }
    public void paly(){
        popcorn.play();
        dvdPlayer.play();
        projector.play();
        screen.play();
    }
    public void close(){
        popcorn.off();
        dvdPlayer.off();
        projector.off();
        screen.off();
    }


}
