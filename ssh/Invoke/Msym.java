package Invoke;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/**
 * Created by len on 2017/6/9.
 */
public class Msym {

    public void test(String[] arg){
        for (String string : arg) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) throws Exception {
        //获取字节码对象
        Class<Msym> clazz = (Class<Msym>) Class.forName("Invoke.Msym");

        //获取一个对象
        Constructor con =  clazz.getConstructor();
        Msym m = (Msym) con.newInstance();
        String[] s = new String[]{"aa","bb"};
        m.test(s);
        //获取Method对象
        Method method = clazz.getMethod("test", String[].class);
        //调用invoke方法来调用
        method.invoke(m,new Object[]{s});
        method.invoke(m, (Object) s);
    }

}
