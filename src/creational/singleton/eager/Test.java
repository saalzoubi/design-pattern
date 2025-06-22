package creational.singleton.eager;

public class Test {
    public static void main(String[] args) {
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();
        EagerSingleton s3 = EagerSingleton.getInstance();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
