package creational.singleton.eager;

/**
 * ✅ Pros: Simple, thread-safe without synchronization
 * ❌ Cons: Instance is created even if not used
 * */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    };

}
