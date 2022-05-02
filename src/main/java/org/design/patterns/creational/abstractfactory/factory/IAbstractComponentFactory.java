package org.design.patterns.creational.abstractfactory.factory;

import org.design.patterns.creational.abstractfactory.object.button.Button;
import org.design.patterns.creational.abstractfactory.object.button.ButtonSize;
import org.design.patterns.creational.abstractfactory.object.slider.Slider;
import org.design.patterns.creational.abstractfactory.object.slider.SliderWidth;

public interface IAbstractComponentFactory {
    Button constructButton(ButtonSize buttonSize);
    Slider constructSlider(SliderWidth sliderWidth);
}
