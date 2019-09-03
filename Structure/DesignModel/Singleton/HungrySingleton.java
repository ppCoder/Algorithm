package DesignModel.Singleton;

/**
 * 饿汉式单例模式：
 * 不管用不用都去初始化
 * 造成内存浪费
 */
public class HungrySingleton {
    private HungrySingleton() {
    }

    private static final HungrySingleton instance = new HungrySingleton();

   public static HungrySingleton getInstance() {
       return instance;
   }
}

//1和2的构造方法 原理相同
class HungryStaticSingleton{
    private HungryStaticSingleton() {
    }

    private static final HungryStaticSingleton instance;

    static{
        instance = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return instance;
    }
}
