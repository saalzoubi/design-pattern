package structural.proxy.proxy;

import structural.proxy.dto.User;
import structural.proxy.dto.UserType;
import structural.proxy.target.Document;
import structural.proxy.target.WordDocument;

import java.util.List;
import java.util.Objects;

public class DocumentProxy implements Document {
    private User user;
    private WordDocument wordDocument;

    public DocumentProxy(User user) {
        this.user = user;
    }

    @Override
    public void display() {
        wordDocument = new WordDocument();
        wordDocument.display();

    }

    @Override
    public void update() {
        if (user == null) {
            System.out.println("user is null");
            return;
        }
        if (!List.of(UserType.ADMIN, UserType.AUDITOR).contains(user.getRole())) {
            System.out.println(user.getRole() + ": User role is not allowed to update the document");
            return;
        }
        wordDocument = new WordDocument();
        System.out.println(user.getRole() + ": Updating document");
        wordDocument.update();
    }

    @Override
    public void delete() {
        if (user == null) {
            System.out.println("user is null");
            return;
        }
        if (!Objects.equals(UserType.ADMIN, user.getRole())) {
            System.out.println(user.getRole() + ": User role is not allowed to delete the document");
            return;
        }
        wordDocument = new WordDocument();
        System.out.println(user.getRole() + ": Deleting document");
        wordDocument.delete();
    }
}
