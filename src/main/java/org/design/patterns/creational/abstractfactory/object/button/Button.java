package org.design.patterns.creational.abstractfactory.object.button;

import lombok.Getter;
import org.design.patterns.creational.abstractfactory.object.IComponent;

@Getter
public abstract class Button implements IComponent {
    protected ButtonSize buttonSize;
}
