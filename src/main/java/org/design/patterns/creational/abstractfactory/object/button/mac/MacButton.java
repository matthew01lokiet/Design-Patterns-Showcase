package org.design.patterns.creational.abstractfactory.object.button.mac;

import org.design.patterns.creational.abstractfactory.object.button.Button;
import org.design.patterns.creational.abstractfactory.object.button.ButtonSize;

public class MacButton extends Button {

    private final LoadMacButtonAssets loadMacButtonAssets;

    public MacButton(ButtonSize buttonSize, LoadMacButtonAssets loadMacButtonAssets) {
        this.buttonSize = buttonSize;
        this.loadMacButtonAssets = loadMacButtonAssets;
    }

    @Override
    public void display() {
        System.out.println("\nConstructing mac button...");
        System.out.println(loadMacButtonAssets);
        System.out.printf("Button size %s\n", buttonSize);
        System.out.println("Constructed mac button successfully!\n");
    }
}
