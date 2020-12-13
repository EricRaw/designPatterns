package facade;

/**
 * @author EricRaww
 * @create 2020-12-13
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.paly();
        homeTheaterFacade.close();
    }
}
