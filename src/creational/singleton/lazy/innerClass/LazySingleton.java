package creational.singleton.lazy.innerClass;

/**
 * 🔍 What’s Happening Here?
 * </br>
 * 1. The outer class (AppConfigManager) provides the public getInstance() method.
 *</br>
 * 2. The inner static class (Holder) contains the instance and is only loaded when referenced.
 *</br>
 * 3. Java's classloader ensures thread safety and lazy initialization without synchronized.
 * </br>
 * */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {}

    private class InnerClass{
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return InnerClass.INSTANCE;
    }

}
