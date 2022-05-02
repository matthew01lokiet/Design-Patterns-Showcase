package org.design.patterns.creational.abstractfactory.factory;

import org.design.patterns.creational.abstractfactory.object.button.Button;
import org.design.patterns.creational.abstractfactory.object.button.ButtonSize;
import org.design.patterns.creational.abstractfactory.object.button.linux.LinuxButton;
import org.design.patterns.creational.abstractfactory.object.button.linux.LoadLinuxButtonAssets;
import org.design.patterns.creational.abstractfactory.object.slider.Slider;
import org.design.patterns.creational.abstractfactory.object.slider.SliderWidth;
import org.design.patterns.creational.abstractfactory.object.slider.linux.LinuxSlider;
import org.design.patterns.creational.abstractfactory.object.slider.linux.LoadLinuxSliderAssets;

public class LinuxComponentFactory implements IAbstractComponentFactory{

    @Override
    public Button constructButton(ButtonSize buttonSize) {
        return new LinuxButton(buttonSize, new LoadLinuxButtonAssets());
    }

    @Override
    public Slider constructSlider(SliderWidth sliderWidth) {
        return new LinuxSlider(sliderWidth, new LoadLinuxSliderAssets());
    }
}
