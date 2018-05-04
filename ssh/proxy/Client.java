package proxy;

/**
 * Created by dengry on 2016/8/4.
 */
public class Client {
    public static void main(String[] args) {
        RealSubject realSubject=new  RealSubject();

        ProxySubject subject=new  ProxySubject();
        subject.setRealSubject(realSubject);
        subject.doSomething();
    }
}
