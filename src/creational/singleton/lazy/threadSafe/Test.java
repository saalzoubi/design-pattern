package creational.singleton.lazy.threadSafe;


public class Test {
    public static void main(String[] args) {
        LazyThreadSafeSingleton s1 = LazyThreadSafeSingleton.getInstance();
        LazyThreadSafeSingleton s2 = LazyThreadSafeSingleton.getInstance();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
