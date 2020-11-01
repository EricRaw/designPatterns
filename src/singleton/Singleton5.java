package singleton;

/**
 * @author EricRaww
 * @create 2020-11-01
 * 懒汉式，线程安全，同步代码块
 * 不推荐使用
 */
public class Singleton5 {
    private Singleton5() {
    }
    private static Singleton5 instance;
    public static Singleton5 getInstance(){
        if(instance==null)
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        return instance;
    }
}
