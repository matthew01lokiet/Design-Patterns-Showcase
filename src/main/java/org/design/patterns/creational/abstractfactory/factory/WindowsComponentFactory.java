package org.design.patterns.creational.abstractfactory.factory;

import org.design.patterns.creational.abstractfactory.object.button.Button;
import org.design.patterns.creational.abstractfactory.object.button.ButtonSize;
import org.design.patterns.creational.abstractfactory.object.button.windows.LoadWindowsButtonAssets;
import org.design.patterns.creational.abstractfactory.object.button.windows.WindowsButton;
import org.design.patterns.creational.abstractfactory.object.slider.Slider;
import org.design.patterns.creational.abstractfactory.object.slider.SliderWidth;
import org.design.patterns.creational.abstractfactory.object.slider.windows.LoadWindowsSliderAssets;
import org.design.patterns.creational.abstractfactory.object.slider.windows.WindowsSlider;

public class WindowsComponentFactory implements IAbstractComponentFactory{

    @Override
    public Button constructButton(ButtonSize buttonSize) {
        return new WindowsButton(buttonSize, new LoadWindowsButtonAssets());
    }

    @Override
    public Slider constructSlider(SliderWidth sliderWidth) {
        return new WindowsSlider(sliderWidth, new LoadWindowsSliderAssets());
    }
}
