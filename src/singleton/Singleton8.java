package singleton;

/**
 * @author EricRaww
 * @create 2020-11-01
 * 使用枚举可以实现单例，推荐
 * 不进避免多线程同步问题，还能防止反序列化重新创建新的对象
 */
public enum Singleton8 {
    INSTANCE;
    public void sayHello(){
        System.out.println("hello");
    }
}
