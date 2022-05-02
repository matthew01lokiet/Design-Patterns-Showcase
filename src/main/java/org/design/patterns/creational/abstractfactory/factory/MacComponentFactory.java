package org.design.patterns.creational.abstractfactory.factory;

import org.design.patterns.creational.abstractfactory.object.button.Button;
import org.design.patterns.creational.abstractfactory.object.button.ButtonSize;
import org.design.patterns.creational.abstractfactory.object.button.mac.LoadMacButtonAssets;
import org.design.patterns.creational.abstractfactory.object.button.mac.MacButton;
import org.design.patterns.creational.abstractfactory.object.slider.Slider;
import org.design.patterns.creational.abstractfactory.object.slider.SliderWidth;
import org.design.patterns.creational.abstractfactory.object.slider.mac.LoadMacSliderAssets;
import org.design.patterns.creational.abstractfactory.object.slider.mac.MacSlider;

public class MacComponentFactory implements IAbstractComponentFactory{

    @Override
    public Button constructButton(ButtonSize buttonSize) {
        return new MacButton(buttonSize, new LoadMacButtonAssets());
    }

    @Override
    public Slider constructSlider(SliderWidth sliderWidth) {
        return new MacSlider(sliderWidth, new LoadMacSliderAssets());
    }
}
