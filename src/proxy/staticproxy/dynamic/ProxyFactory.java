package proxy.staticproxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author EricRaww
 * @create 2020-11-29
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * ClassLoader loader,指定当前目标对象使用的类加载器, 获取加载器的方法固定
     * Class<?>[] interfaces,目标对象实现的接口类型，使用泛型方法确认类型
     * InvocationHandler h,事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行
     * 的目标对象方法作为参数传入
     * @return
     */
    Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        Object object = method.invoke(target, args);
                        return object;
                    }
                });
    }
}
