package org.design.patterns.creational.prototype.user;

import lombok.Getter;

import java.util.UUID;

public class User implements Cloneable{

    private final String id;
    @Getter
    private UserDetails userDetails;

    public User(String name, String lastName, int age) {
        this.id = UUID.randomUUID().toString();
        this.userDetails = new UserDetails(name, lastName, age);
    }

    @Override
    public String toString() {
        return String.format(
                "User: %s %s %s %d%n", id, userDetails.getName(), userDetails.getLastName(), userDetails.getAge()
        );
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // shallow copy
        var user = (User) super.clone();
        // deep copy to not share reference
        user.userDetails = new UserDetails(userDetails.getName(), userDetails.getLastName(), userDetails.getAge());
        return user;
    }
}
