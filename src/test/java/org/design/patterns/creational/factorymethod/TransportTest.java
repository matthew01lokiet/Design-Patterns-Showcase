package org.design.patterns.creational.factorymethod;

import lombok.val;
import org.design.patterns.creational.factorymethod.factory.BoatTransportFactory;
import org.design.patterns.creational.factorymethod.factory.CarTransportFactory;
import org.design.patterns.creational.factorymethod.factory.PlaneTransportFactory;
import org.design.patterns.creational.factorymethod.object.boat.Boat;
import org.design.patterns.creational.factorymethod.object.car.Car;
import org.design.patterns.creational.factorymethod.object.plane.Plane;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Transport test")
class TransportTest {

    @Test
    @DisplayName("Test car transport instantiation.")
    void testCarTransportInstantiation() {
        val productionYear = 2020;

        val carTransportFactory = new CarTransportFactory();
        val carTransport = carTransportFactory.provideTransport(productionYear);

        assertNotNull(carTransport);
        assertInstanceOf(Car.class,carTransport);
        assertEquals(productionYear,carTransport.getProductionYear());
        carTransport.start();
    }

    @Test
    @DisplayName("Test boat transport instantiation.")
    void testBoatTransportInstantiation() {
        val productionYear = 2021;

        val boatTransportFactory = new BoatTransportFactory();
        val boatTransport = boatTransportFactory.provideTransport(productionYear);

        assertNotNull(boatTransport);
        assertInstanceOf(Boat.class,boatTransport);
        assertEquals(productionYear,boatTransport.getProductionYear());
        boatTransport.start();
    }

    @Test
    @DisplayName("Test plane transport instantiation.")
    void testPlaneTransportInstantiation() {
        val productionYear = 2022;

        val planeTransportFactory = new PlaneTransportFactory();
        val planeTransport = planeTransportFactory.provideTransport(productionYear);

        assertNotNull(planeTransport);
        assertInstanceOf(Plane.class,planeTransport);
        assertEquals(productionYear,planeTransport.getProductionYear());
        planeTransport.start();
    }

    @Test
    @DisplayName("Test interchanging of transports.")
    void testInterchangingOfTransports() {
        val planeProductionYear = 2020;
        val boatProductionYear = 2021;
        val carProductionYear = 2022;

        val planeTransportFactory = new PlaneTransportFactory();
        val boatTransportFactory = new BoatTransportFactory();
        val carTransportFactory = new CarTransportFactory();

        var transport = planeTransportFactory.provideTransport(planeProductionYear);

        assertNotNull(transport);
        assertInstanceOf(Plane.class,transport);
        assertEquals(planeProductionYear,transport.getProductionYear());

        transport = boatTransportFactory.provideTransport(boatProductionYear);

        assertNotNull(transport);
        assertInstanceOf(Boat.class,transport);
        assertEquals(boatProductionYear,transport.getProductionYear());

        transport = carTransportFactory.provideTransport(carProductionYear);

        assertNotNull(transport);
        assertInstanceOf(Car.class,transport);
        assertEquals(carProductionYear,transport.getProductionYear());
    }
}