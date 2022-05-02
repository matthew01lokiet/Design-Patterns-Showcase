package org.design.patterns.creational.abstractfactory.object.button.windows;

import org.design.patterns.creational.abstractfactory.object.button.Button;
import org.design.patterns.creational.abstractfactory.object.button.ButtonSize;

public class WindowsButton extends Button {

    private final LoadWindowsButtonAssets loadWindowsButtonAssets;

    public WindowsButton(ButtonSize buttonSize, LoadWindowsButtonAssets loadWindowsButtonAssets) {
        this.buttonSize = buttonSize;
        this.loadWindowsButtonAssets = loadWindowsButtonAssets;
    }

    @Override
    public void display() {
        System.out.println("\nConstructing windows button...");
        System.out.println(loadWindowsButtonAssets);
        System.out.printf("Button size %s\n", buttonSize);
        System.out.println("Constructed windows button successfully!\n");
    }
}
