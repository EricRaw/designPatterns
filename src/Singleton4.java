/**
 * @author EricRaww
 * @create 2020-11-01
 * 懒汉式 线程安全，同步方法
 * 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
 * 效率低，每次getInstance都要进行同步方法
 * 开发中，不推荐
 */
public class Singleton4 {
    private Singleton4() {
    }
    private static Singleton4 instance;

    public synchronized static Singleton4 getInstance(){
        if(instance==null)
            instance=new Singleton4();
        return instance;
    }
}
