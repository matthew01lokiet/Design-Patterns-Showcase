package org.design.patterns.creational.abstractfactory.object.button;

public enum ButtonSize {
    BIG,
    MEDIUM,
    SMALL;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
