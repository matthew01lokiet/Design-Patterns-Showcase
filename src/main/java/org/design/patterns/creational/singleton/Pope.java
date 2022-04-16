package org.design.patterns.creational.singleton;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class Pope {

    private final String name;

    private static volatile Pope pope;

    public static Pope getPope(final String name) {
        if (pope != null) {
            return pope;
        }

        synchronized (Pope.class) {
            if (pope == null) {
                pope = new Pope(name);
            }
        }

        return pope;
    }
}
