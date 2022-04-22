package org.design.patterns.creational.factorymethod.factory;

import org.design.patterns.creational.factorymethod.object.Transport;
import org.design.patterns.creational.factorymethod.object.boat.Boat;
import org.design.patterns.creational.factorymethod.object.boat.BoatGenoa;
import org.design.patterns.creational.factorymethod.object.boat.BoatMainsail;
import org.design.patterns.creational.factorymethod.object.boat.BoatMast;

public class BoatTransportFactory implements ITransportFactory{

    @Override
    public Transport provideTransport(int productionYear) {
        return new Boat(productionYear,new BoatGenoa(),new BoatMainsail(),new BoatMast());
    }
}
