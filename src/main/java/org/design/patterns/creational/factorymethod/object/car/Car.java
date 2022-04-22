package org.design.patterns.creational.factorymethod.object.car;

import org.design.patterns.creational.factorymethod.object.Transport;

public class Car extends Transport {

    private final CarDashboard carDashboard;
    private final CarParkingSensor carParkingSensor;
    private final CarSpoiler carSpoiler;

    public Car(
            int productionYear,
            CarDashboard carDashboard,
            CarParkingSensor carParkingSensor,
            CarSpoiler carSpoiler
    ) {
        super(productionYear);
        this.carDashboard = carDashboard;
        this.carParkingSensor = carParkingSensor;
        this.carSpoiler = carSpoiler;
    }

    @Override
    public void start() {
        System.out.println();
        System.out.println(carDashboard);
        System.out.println(carParkingSensor);
        System.out.println(carSpoiler);
        System.out.printf("Production year: %d%n", productionYear);
        System.out.println("Car checked, starting...\n");
    }
}
