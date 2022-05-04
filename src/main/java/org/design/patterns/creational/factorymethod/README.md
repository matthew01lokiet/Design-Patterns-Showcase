# Factory Method

## Characteristics
- Outsources object (`Product`) instantiation logic to factory (`Producer`).
- Aims to provide flexibility by allowing factory (`Producer`) extensions with concrete implementations
that return concrete object (`Product`) implementations.

## Use Cases
- When object instantiation process is complicated.
- When you anticipate that there might be more that one concrete object type and client code might want to interchange
object types (e.g. object type might be chosen or changed during runtime depending on some condition).

### Provided Example
Transportation Provider

**Implementation**
- `factory` (package)
  - `ITransportFactory.java` (factory interface with contract for transport instantiation)
  - `CarTransportFactory.java` (concrete factory complying with interface that instantiates car transport)
  - `BoatTransportFactory.java` (concrete factory complying with interface that instantiates boat transport)
  - `PlaneTransportFactory.java` (concrete factory complying with interface that instantiates plane transport)
- `object` (package)
  - `Transport.java` (abstract class template for concrete transport implementations)
  - `boat` (package)
    - `Boat.java` (concrete boat transport implementation)
    - `BoatGenoa.java` (boat transport dependency)
    - `BoatMainsail.java` (boat transport dependency)
    - `BoatMast.java` (boat transport dependency)
  - `car` (package)
    - `Car.java` (concrete car transport implementation)
    - `CarDashboard.java` (car transport dependency)
    - `CarParkingSensor.java` (car transport dependency)
    - `CarSpoiler.java` (car transport dependency)
  - `plane` (package)
    - `Plane.java` (concrete plane transport implementation)
    - `PlaneCockpit.java` (plane transport dependency)
    - `PlaneTurbineEngine.java` (plane transport dependency)
    - `PlaneVerticalStabilizer.java` (plane transport dependency)

**Usage Showcase**
- `TransportTest.java` 