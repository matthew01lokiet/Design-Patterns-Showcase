package org.design.patterns.creational.abstractfactory.object.slider;

import lombok.Getter;
import org.design.patterns.creational.abstractfactory.object.IComponent;

@Getter
public abstract class Slider implements IComponent {
    protected SliderWidth sliderWidth;
}
