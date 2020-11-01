package singleton;

/**
 * @author EricRaww
 * @create 2020-10-31
 * 饿汉式 静态常量
 * 1.构造器私有化
 * 2.类的内部创建对象
 * 3.向外暴露一个静态的公共方法
 * 优点：在类装载的时候就完成了实例化，避免了线程同步问题
 * 缺点：没有lazy loading，造成内存浪费
 */
public class Singleton1 {

        private Singleton1() {
        }

       private final static Singleton1 instance= new Singleton1();

        public static Singleton1 getInstance(){
            return instance;
        }
    }

