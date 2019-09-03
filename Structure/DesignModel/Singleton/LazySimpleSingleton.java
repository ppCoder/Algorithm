package DesignModel.Singleton;


/**
 * 懒汉式单例模式：
 * 优点：能够解决内存浪费的问题
 * 风险：有可能创建多个不同的实例
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }

    //解决双重校验 指令重排序的问题
    private volatile static LazySimpleSingleton instance;

    //同步锁
    /*public static synchronized LazySimpleSingleton getInstance(){
        if(instance == null){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }*/

    //双重校验
    public static LazySimpleSingleton getInstance(){
        if(instance == null) {
            synchronized (LazySimpleSingleton.class) {
                if (instance == null) {
                    instance = new LazySimpleSingleton();
                }
            }
        }
        return instance;
    }

}
