package org.design.patterns.creational.prototype;

import lombok.val;
import org.design.patterns.creational.prototype.user.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotSame;

@DisplayName("User test")
class UserTest {

    @Test
    @DisplayName("Deep copy user information")
    void testCopyUserInformation() throws CloneNotSupportedException {
        val user = new User("John", "Doe", 10);
        System.out.println(user);

        val clonedUser = (User) user.clone();
        System.out.println(clonedUser);

        assertNotSame(user, clonedUser);
        assertNotSame(user.getUserDetails(), clonedUser.getUserDetails());
        assertThat(clonedUser).usingRecursiveComparison().isEqualTo(user);
    }
}
