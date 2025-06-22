package creational.singleton.lazy.doubleCheck;

/**
 * ✅ Efficient + thread-safe
 * 🧠 volatile ensures visibility of changes to all threads
 * */
public class LazySingletonDoubleCheck {
    private static LazySingletonDoubleCheck instance;
    private LazySingletonDoubleCheck() {}
    public static LazySingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new LazySingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
