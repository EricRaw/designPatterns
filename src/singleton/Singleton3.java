package singleton;

/**
 * @author EricRaww
 * @create 2020-10-31
 * 懒汉式 线程不安全
 * 提供一个静态的公有方法，当使用该方法，才去创建instance
 * 实际开发中，不能使用，线程不安全
 */
public class Singleton3 {
    private Singleton3() {
    }
    private static Singleton3 instance;

    public static Singleton3 getInstance(){
        if(instance==null)
            instance= new Singleton3();
        return instance;
    }
}
