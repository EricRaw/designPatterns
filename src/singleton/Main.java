package singleton;

/**
 * 单例模式应用：
 * 1.保证了系统内存中该类只存在一个对象，节省了系统资源。（需要频繁创建销毁的对象）
 * 2.实例化单例类时，只能get**(); 而不是new
 * 3.重量级对象，工具类，Runtime类
 */

public class Main {

    public static void main(String[] args) {
        /**
         * 单例模式在JDK应用
         * public class Runtime {
         *     private static Runtime currentRuntime = new Runtime();
         *     public static Runtime getRuntime() {
         *         return currentRuntime;
         *     }
         *      private Runtime() {}
         */


        Singleton8 singleton1 = Singleton8.INSTANCE;
        Singleton8 singleton11 = Singleton8.INSTANCE;
        System.out.println(singleton1 == singleton11);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
