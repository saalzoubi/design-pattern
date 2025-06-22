package creational.singleton.lazy;


public class Test {
    public static void main(String[] args) {
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
