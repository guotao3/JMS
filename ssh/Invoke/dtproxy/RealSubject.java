package dtproxy;

/**
 * Created by dengry on 2016/8/4.
 */
class RealSubject implements AbstractSubject {
    public void request() {
        System.out.println("RealSubject's request() ...");
    }
}
