package org.design.patterns.creational.factorymethod.object.plane;

import org.design.patterns.creational.factorymethod.object.Transport;


public class Plane extends Transport {

    private final PlaneCockpit planeCockpit;
    private final PlaneTurbineEngine planeTurbineEngine;
    private final PlaneVerticalStabilizer planeVerticalStabilizer;

    public Plane(
            int productionYear,
            PlaneCockpit planeCockpit,
            PlaneTurbineEngine planeTurbineEngine,
            PlaneVerticalStabilizer planeVerticalStabilizer
    ) {
        super(productionYear);
        this.planeCockpit = planeCockpit;
        this.planeTurbineEngine = planeTurbineEngine;
        this.planeVerticalStabilizer = planeVerticalStabilizer;
    }

    @Override
    public void start() {
        System.out.println();
        System.out.println(planeCockpit);
        System.out.println(planeTurbineEngine);
        System.out.println(planeVerticalStabilizer);
        System.out.printf("Production year: %d%n",productionYear);
        System.out.println("Plane checked, starting...\n");
    }
}
