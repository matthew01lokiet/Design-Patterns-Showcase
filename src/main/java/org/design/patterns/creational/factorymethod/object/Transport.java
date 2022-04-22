package org.design.patterns.creational.factorymethod.object;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Transport {
    protected int productionYear;
    public abstract void start();
}
