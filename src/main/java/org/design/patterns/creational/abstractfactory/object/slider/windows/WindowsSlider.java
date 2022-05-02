package org.design.patterns.creational.abstractfactory.object.slider.windows;

import org.design.patterns.creational.abstractfactory.object.slider.Slider;
import org.design.patterns.creational.abstractfactory.object.slider.SliderWidth;

public class WindowsSlider extends Slider {

    private final LoadWindowsSliderAssets loadWindowsSliderAssets;

    public WindowsSlider(SliderWidth sliderWidth, LoadWindowsSliderAssets loadWindowsSliderAssets) {
        this.sliderWidth = sliderWidth;
        this.loadWindowsSliderAssets = loadWindowsSliderAssets;
    }

    @Override
    public void display() {
        System.out.println("\nConstructing windows slider...");
        System.out.println(loadWindowsSliderAssets);
        System.out.printf("Slider width %s\n", sliderWidth);
        System.out.println("Constructed windows slider successfully!\n");
    }
}
