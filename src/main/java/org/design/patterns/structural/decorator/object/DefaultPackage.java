package org.design.patterns.structural.decorator.object;

import java.time.LocalDate;

public class DefaultPackage extends Package{

    public DefaultPackage() {
        super(1, "Default Package", LocalDate.now().plusDays(3));
    }
}
