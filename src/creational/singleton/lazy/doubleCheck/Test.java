package creational.singleton.lazy.doubleCheck;


public class Test {
    public static void main(String[] args) {
        LazySingletonDoubleCheck s1 = LazySingletonDoubleCheck.getInstance();
        LazySingletonDoubleCheck s2 = LazySingletonDoubleCheck.getInstance();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
