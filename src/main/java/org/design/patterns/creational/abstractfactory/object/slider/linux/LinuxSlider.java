package org.design.patterns.creational.abstractfactory.object.slider.linux;

import org.design.patterns.creational.abstractfactory.object.slider.Slider;
import org.design.patterns.creational.abstractfactory.object.slider.SliderWidth;

public class LinuxSlider extends Slider {

    private final LoadLinuxSliderAssets loadLinuxSliderAssets;

    public LinuxSlider(SliderWidth sliderWidth, LoadLinuxSliderAssets loadLinuxSliderAssets) {
        this.sliderWidth = sliderWidth;
        this.loadLinuxSliderAssets = loadLinuxSliderAssets;
    }

    @Override
    public void display() {
        System.out.println("\nConstructing linux slider...");
        System.out.println(loadLinuxSliderAssets);
        System.out.printf("Slider width %s\n", sliderWidth);
        System.out.println("Constructed linux slider successfully!\n");
    }
}
