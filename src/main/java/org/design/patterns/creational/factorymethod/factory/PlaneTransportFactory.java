package org.design.patterns.creational.factorymethod.factory;

import org.design.patterns.creational.factorymethod.object.Transport;
import org.design.patterns.creational.factorymethod.object.plane.Plane;
import org.design.patterns.creational.factorymethod.object.plane.PlaneCockpit;
import org.design.patterns.creational.factorymethod.object.plane.PlaneTurbineEngine;
import org.design.patterns.creational.factorymethod.object.plane.PlaneVerticalStabilizer;

public class PlaneTransportFactory implements ITransportFactory{

    @Override
    public Transport provideTransport(int productionYear) {
        return new Plane(productionYear, new PlaneCockpit(), new PlaneTurbineEngine(), new PlaneVerticalStabilizer());
    }
}
