package proxy;

/**
 * 代理角色
 * Created by dengry on 2016/8/4.
 */
public class ProxySubject implements Subject {
    //持有真实角色的引用
    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void doSomething() {
        System.out.println("在执行目标方法前作处理");
        realSubject.doSomething();
        System.out.println("在执行目标方法后作处理");
    }
}
