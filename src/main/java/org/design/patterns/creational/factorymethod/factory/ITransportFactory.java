package org.design.patterns.creational.factorymethod.factory;

import org.design.patterns.creational.factorymethod.object.Transport;

public interface ITransportFactory {
    Transport provideTransport(int productionYear);
}
