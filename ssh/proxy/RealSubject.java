package proxy;

/**
 * 真实角色
 * Created by dengry on 2016/8/4.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("do something");
    }
}
