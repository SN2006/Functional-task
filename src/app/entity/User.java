package app.entity;

public class User {

    private final String name;
    private final String phone;

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User: " + name + ", phone: " + phone;
    }
}
