package structural.proxy.dto;

public class User {
    private String name;
    private UserType role;

    public User(String name, UserType role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public UserType getRole() {
        return role;
    }
}

