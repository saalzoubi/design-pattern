package structural.facade.services;

import structural.facade.dto.User;

import java.util.List;

public class NotificationService {
    List<User> users;
    public NotificationService(List<User> users) {
        this.users = users;
    }

    public void sendNotification(User user){
        if(!this.users.contains(user)){
            throw new RuntimeException("User does not exist");
        }
        System.out.println("Notification has been sent to: "+user.getUsername());
    }
}
