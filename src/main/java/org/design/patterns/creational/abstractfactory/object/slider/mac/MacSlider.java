package org.design.patterns.creational.abstractfactory.object.slider.mac;

import org.design.patterns.creational.abstractfactory.object.slider.Slider;
import org.design.patterns.creational.abstractfactory.object.slider.SliderWidth;

public class MacSlider extends Slider {

    private final LoadMacSliderAssets loadMacSliderAssets;

    public MacSlider(SliderWidth sliderWidth, LoadMacSliderAssets loadMacSliderAssets) {
        this.sliderWidth = sliderWidth;
        this.loadMacSliderAssets = loadMacSliderAssets;
    }

    @Override
    public void display() {
        System.out.println("\nConstructing mac slider...");
        System.out.println(loadMacSliderAssets);
        System.out.printf("Slider width %s\n", sliderWidth);
        System.out.println("Constructed mac slider successfully!\n");
    }
}
