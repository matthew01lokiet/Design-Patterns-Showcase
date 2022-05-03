package org.design.patterns.creational.prototype.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
class UserDetails implements Cloneable{

    private final String name;
    private final String lastName;
    private final int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // shallow copy
        return super.clone();
    }
}
