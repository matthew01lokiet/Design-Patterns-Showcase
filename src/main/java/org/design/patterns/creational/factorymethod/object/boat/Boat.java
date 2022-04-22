package org.design.patterns.creational.factorymethod.object.boat;

import org.design.patterns.creational.factorymethod.object.Transport;

public class Boat extends Transport {

    private final BoatGenoa boatGenoa;
    private final BoatMainsail boatMainsail;
    private final BoatMast boatMast;

    public Boat(int productionYear, BoatGenoa boatGenoa, BoatMainsail boatMainsail, BoatMast boatMast) {
        super(productionYear);
        this.boatGenoa = boatGenoa;
        this.boatMainsail = boatMainsail;
        this.boatMast = boatMast;
    }

    @Override
    public void start() {
        System.out.println();
        System.out.println(boatGenoa);
        System.out.println(boatMainsail);
        System.out.println(boatMast);
        System.out.printf("Production year: %d%n", productionYear);
        System.out.println("Boat checked, starting...\n");
    }
}
