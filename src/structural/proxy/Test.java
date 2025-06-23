package structural.proxy;

import structural.proxy.dto.User;
import structural.proxy.dto.UserType;
import structural.proxy.proxy.DocumentProxy;
import structural.proxy.target.WordDocument;

public class Test {
    public static void main(String[] args) {
        WordDocument wordDocument = new WordDocument();
        User user1 = new User("Ali", UserType.ADMIN);
        User user2 = new User("Ahmad", UserType.AUDITOR);
        User user3 = new User("Hasan", UserType.USER);

        DocumentProxy documentProxy = new DocumentProxy(user1);
        documentProxy.display();
        documentProxy.update();
        documentProxy.delete();
        System.out.println("==================================================");
        DocumentProxy documentProxy2 = new DocumentProxy(user2);
        documentProxy2.display();
        documentProxy2.update();
        documentProxy2.delete();
        System.out.println("==================================================");
        DocumentProxy documentProxy3 = new DocumentProxy(user3);
        documentProxy3.display();
        documentProxy3.update();
        documentProxy3.delete();
    }

}
