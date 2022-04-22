package org.design.patterns.creational.factorymethod.factory;

import org.design.patterns.creational.factorymethod.object.Transport;
import org.design.patterns.creational.factorymethod.object.car.Car;
import org.design.patterns.creational.factorymethod.object.car.CarDashboard;
import org.design.patterns.creational.factorymethod.object.car.CarParkingSensor;
import org.design.patterns.creational.factorymethod.object.car.CarSpoiler;

public class CarTransportFactory implements ITransportFactory{

    @Override
    public Transport provideTransport(int productionYear) {
        return new Car(productionYear,new CarDashboard(),new CarParkingSensor(), new CarSpoiler());
    }
}
