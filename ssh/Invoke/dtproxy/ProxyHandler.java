package dtproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ProxyHandler代理处理类;采用JDK动态代理必须实现InvocationHandler接口
 * Created by dengry on 2016/8/4.
 */
public class ProxyHandler implements InvocationHandler {
    //目标对象，真实角色
    private Object targetObject;

    public void setTarget(Object o) {
        this.targetObject = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行真实角色的方法
        System.out.println("before");
        Object result = method.invoke(targetObject, args);
        System.out.println("after");
        return result;
    }
}
