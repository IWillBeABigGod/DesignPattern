package SinglePattern;

public class Singleton {

    /**
     * 懒汉式
     * 线程不安全
     */
    /*
    private static Singleton instance;
    //私有化构造方法
    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    */

    /**
     * 懒汉式
     * 线程安全
     */
    /*
    private static Singleton instance;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    */

    /**
     * 饿汉式
     * 线程安全
     */
    /*
    private static Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
    */

    /**
     * 双重校验锁
     * 线程安全
     */
    /*
    private volatile static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    */

    /**
     * 登记式/静态内部类
     * 线程安全
     */
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){}

    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}

/**
 * 枚举
 * 线程安全
 */
/*
public enum SingleTon{
    INSTANCE;
}
*/
