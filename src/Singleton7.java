/**
 * @author EricRaww
 * @create 2020-11-01
 * 静态内部类,推荐使用
 * 写一个静态内部类，该类中有一个静态属性
 * 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
 * 采用了类装载的机制来保证初始化的实例时只有一个线程
 *
 */
public class Singleton7 {
    private Singleton7() {
    }
    private static volatile Singleton7 instance;

    private static class SingletonInstance{
        private static final Singleton7 INSTANCE=new Singleton7();
    }
    public static synchronized Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
