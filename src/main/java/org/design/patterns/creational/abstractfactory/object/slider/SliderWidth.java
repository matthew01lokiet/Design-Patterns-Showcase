package org.design.patterns.creational.abstractfactory.object.slider;

public enum SliderWidth {
    WIDE,
    WIDER,
    WIDEST;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
