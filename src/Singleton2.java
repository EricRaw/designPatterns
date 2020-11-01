/**
 * @author EricRaww
 * @create 2020-10-31
 * 饿汉式 静态变量
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 instance;

    static {//在静态代码块中，创建单例对象
        instance=new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }


}
