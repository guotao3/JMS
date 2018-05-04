package Observer;

/**
 * Created by len on 2017/6/9.
 */
public class ConcreteWatcher implements Watcher {
    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
