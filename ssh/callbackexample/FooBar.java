package callbackexample;

/**
 * Created by len on 2017/6/9.
 */
public class FooBar {
    //组合聚合原则
    private ICallBack callBack;
    public void setCallBack(ICallBack callBack) { this.callBack = callBack; doSth(); }
    public void doSth() { callBack.postExec(); }
}
