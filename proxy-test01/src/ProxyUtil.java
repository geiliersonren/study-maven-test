import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: ProxyUtil
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 12:14
 * @Version 1.0
 */
public class ProxyUtil {

//    public static Object newProxyInstance(ClassLoader loader,
//                                          Class<?>[] interfaces,
//                                          InvocationHandler h)

    public static star bigStarProxy(star star){

        star starProxy = (star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{star.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        if(method.getName().equals("sing")){
                            System.out.println("唱歌前准备");
                        } else if(method.getName().equals("dance")) {
                            System.out.println("跳舞前准备");
                        }
                        Object invoke = method.invoke(star, args);

                        System.out.println("收工");
                        return invoke;
                    }
                });

        return starProxy;
    }

}
