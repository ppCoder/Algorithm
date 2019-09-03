package DesignModel.Singleton;

/**
 * 当前类不被初始化，则静态内部类也不被初始化
 * 加载一个类时，其内部类不会被同时加载，一个类被加载，当且仅当某个静态成员被调用时发生
 * 内部类也是一个Class文件，只有用到的时候才会动态加载
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        if(LazyHolder.INNER != null){
            throw new RuntimeException("不允许非法访问!");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.INNER;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton INNER = new LazyInnerClassSingleton();
    }
}
