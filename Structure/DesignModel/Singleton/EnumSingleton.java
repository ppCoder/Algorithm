package DesignModel.Singleton;


/**
 * 枚举类型不能被调用构造方法
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData(){return data;}
    public void setData(Object data){this.data = data;}
    public static EnumSingleton getInstance(){ return INSTANCE;}
}
