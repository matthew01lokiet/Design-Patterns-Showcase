package org.design.patterns.creational.abstractfactory.object.button.linux;

import org.design.patterns.creational.abstractfactory.object.button.Button;
import org.design.patterns.creational.abstractfactory.object.button.ButtonSize;

public class LinuxButton extends Button {

    private final LoadLinuxButtonAssets loadLinuxButtonAssets;

    public LinuxButton(ButtonSize buttonSize, LoadLinuxButtonAssets loadLinuxButtonAssets) {
        this.buttonSize = buttonSize;
        this.loadLinuxButtonAssets = loadLinuxButtonAssets;
    }

    @Override
    public void display() {
        System.out.println("\nConstructing linux button...");
        System.out.println(loadLinuxButtonAssets);
        System.out.printf("Button size %s\n", buttonSize);
        System.out.println("Constructed linux button successfully!\n");
    }
}
