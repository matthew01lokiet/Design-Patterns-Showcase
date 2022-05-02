package org.design.patterns.structural.decorator.decoration;

import org.design.patterns.structural.decorator.object.Package;

import java.time.LocalDate;

public class InternationalPackage extends PackageDecorator{

    public InternationalPackage(Package aPackage) {
        super(aPackage);
    }

    @Override
    public int getCost() {
        return this.aPackage.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return String.format("International %s", this.aPackage.getDescription());
    }

    @Override
    public LocalDate getDate() {
        return this.aPackage.getDate().plusDays(7);
    }
}
