package dtproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 认为：真实角色的类加载器和代理角色的类加载器是一样的
 * Created by dengry on 2016/8/4.
 */
public class Client {
    public static void main(String[] args) {
        // 被代理类的实例
        AbstractSubject realSubject = new RealSubject();

        // 获得被代理类的类加载器，使得JVM能够加载并找到被代理类的内部结构，以及已实现的interface
        ClassLoader loader = realSubject.getClass().getClassLoader();

        // 获得被代理类已实现的所有接口interface,使得动态代理类的实例
        Class[] interfaces = realSubject.getClass().getInterfaces();

        //创建处理器对象
        ProxyHandler handler = new ProxyHandler();
        //传入真实角色
        handler.setTarget(realSubject);

        //通过Proxy的静态方法newProxyInstance创建代理对象
        AbstractSubject proxy = (AbstractSubject) Proxy.newProxyInstance(
                loader, interfaces, handler);

        proxy.request();

    }
}
