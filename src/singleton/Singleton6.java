package singleton;

/**
 * @author EricRaww
 * @create 2020-11-01
 * 双重检查
 * 提供一个静态同步的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
 * 同时保证了效率，推荐使用
 */
public class Singleton6 {
    private Singleton6() {
    }
    //volatile 关键字的两层含义
    //一旦一个共享变量(类的成员变量、类的静态成员变量)被volatile修饰以后，
    //1.保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某一个变量的值，这新值对其他线程来说是可见的
    //2.禁止进行指令重排序
    private static volatile Singleton6 instance;
    public static Singleton6 getInstance(){
        if (instance==null){
            synchronized (Singleton6.class){
                if(instance==null)
                instance=new Singleton6();
            }
        }
       return instance;
    }
}
