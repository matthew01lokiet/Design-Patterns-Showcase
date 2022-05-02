package org.design.patterns.creational.abstractfactory;

import lombok.val;
import org.design.patterns.creational.abstractfactory.factory.IAbstractComponentFactory;
import org.design.patterns.creational.abstractfactory.factory.LinuxComponentFactory;
import org.design.patterns.creational.abstractfactory.factory.MacComponentFactory;
import org.design.patterns.creational.abstractfactory.factory.WindowsComponentFactory;
import org.design.patterns.creational.abstractfactory.object.button.Button;
import org.design.patterns.creational.abstractfactory.object.button.ButtonSize;
import org.design.patterns.creational.abstractfactory.object.button.linux.LinuxButton;
import org.design.patterns.creational.abstractfactory.object.button.mac.MacButton;
import org.design.patterns.creational.abstractfactory.object.button.windows.WindowsButton;
import org.design.patterns.creational.abstractfactory.object.slider.Slider;
import org.design.patterns.creational.abstractfactory.object.slider.SliderWidth;
import org.design.patterns.creational.abstractfactory.object.slider.linux.LinuxSlider;
import org.design.patterns.creational.abstractfactory.object.slider.mac.MacSlider;
import org.design.patterns.creational.abstractfactory.object.slider.windows.WindowsSlider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Component test")
class ComponentTest {

    @Test
    @DisplayName("Test mac components creation.")
    void testMacComponentsCreation() {
        val macFactory = new MacComponentFactory();

        val macButton = macFactory.constructButton(ButtonSize.MEDIUM);
        assertNotNull(macButton);
        assertInstanceOf(MacButton.class, macButton);
        assertEquals("medium", macButton.getButtonSize().toString());
        macButton.display();

        val macSlider = macFactory.constructSlider(SliderWidth.WIDER);
        assertNotNull(macSlider);
        assertInstanceOf(MacSlider.class, macSlider);
        assertEquals("wider", macSlider.getSliderWidth().toString());
        macSlider.display();
    }

    @Test
    @DisplayName("Test linux components creation.")
    void testLinuxComponentsCreation() {
        val linuxFactory = new LinuxComponentFactory();

        val linuxButton = linuxFactory.constructButton(ButtonSize.SMALL);
        assertNotNull(linuxButton);
        assertInstanceOf(LinuxButton.class, linuxButton);
        assertEquals("small", linuxButton.getButtonSize().toString());
        linuxButton.display();

        val linuxSlider = linuxFactory.constructSlider(SliderWidth.WIDE);
        assertNotNull(linuxSlider);
        assertInstanceOf(LinuxSlider.class, linuxSlider);
        assertEquals("wide", linuxSlider.getSliderWidth().toString());
        linuxSlider.display();
    }

    @Test
    @DisplayName("Test windows components creation.")
    void testWindowsComponentsCreation() {
        val windowsFactory = new WindowsComponentFactory();

        val windowsButton = windowsFactory.constructButton(ButtonSize.BIG);
        assertNotNull(windowsButton);
        assertInstanceOf(WindowsButton.class, windowsButton);
        assertEquals("big", windowsButton.getButtonSize().toString());
        windowsButton.display();

        val windowsSlider = windowsFactory.constructSlider(SliderWidth.WIDEST);
        assertNotNull(windowsSlider);
        assertInstanceOf(WindowsSlider.class, windowsSlider);
        assertEquals("widest", windowsSlider.getSliderWidth().toString());
        windowsSlider.display();
    }

    @Test
    @DisplayName("Test components interchanging.")
    void testComponentsInterchanging() {
        IAbstractComponentFactory factory = new LinuxComponentFactory();

        Button button = factory.constructButton(ButtonSize.SMALL);
        assertNotNull(button);
        assertInstanceOf(LinuxButton.class, button);

        Slider slider = factory.constructSlider(SliderWidth.WIDE);
        assertNotNull(slider);
        assertInstanceOf(LinuxSlider.class, slider);

        factory = new MacComponentFactory();

        button = factory.constructButton(ButtonSize.SMALL);
        assertNotNull(button);
        assertInstanceOf(MacButton.class, button);

        slider = factory.constructSlider(SliderWidth.WIDE);
        assertNotNull(slider);
        assertInstanceOf(MacSlider.class, slider);

        factory = new WindowsComponentFactory();

        button = factory.constructButton(ButtonSize.SMALL);
        assertNotNull(button);
        assertInstanceOf(WindowsButton.class, button);

        slider = factory.constructSlider(SliderWidth.WIDE);
        assertNotNull(slider);
        assertInstanceOf(WindowsSlider.class, slider);
    }
}
