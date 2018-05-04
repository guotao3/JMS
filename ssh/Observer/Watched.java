package Observer;

/**
 * Created by len on 2017/6/9.
 */
//抽象主题角色，watched：被观察
public interface Watched {

    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers(String str);
}
