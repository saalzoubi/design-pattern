package creational.singleton.lazy.threadSafe;

/**
 * ✅ Safe, but synchronized adds performance overhead
 * */
public class LazyThreadSafeSingleton {
    private static LazyThreadSafeSingleton instance;
    private LazyThreadSafeSingleton() {}
    public static synchronized LazyThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyThreadSafeSingleton();
        }
        return instance;
    }
}
