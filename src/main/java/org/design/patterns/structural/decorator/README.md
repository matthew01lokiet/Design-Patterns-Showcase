# Decorator

## Characteristics
- Allows attaching new behaviour to the existing objects dynamically during runtime
- Achieves this by providing `Adapter` class which wraps around given object, at the same time complying with
this object type (so `adapter` has **is-a** and **has-a** relationships at the same time!)

## Use Cases
- When you want to compose different configurations of the object, but inheritance is too strict which would result in
many small derived classes with some repeated parts of the code (**composition** over **inheritance**!)
- When you want to attach new behaviour to the object during runtime depending on some conditions

### Provided Example
Package Configuration

**Implementation**
- `decorator` (package)
  - `object` (package)
    - `Package.java` (abstract class with properties)
    - `DefaultPackage.java` (concrete `Package.java` implementation with properties configuration set up during initialization)
  - `decoration` (package)
    - `PackageDecorator.java` (abstract class that extends `Package.java`, but also injects object of this class)
    - `InternationalPackage.java` (concrete `PackageDecorator.java` implementation which provides additional behaviour for retrieved properties)
    - `GiftPackage.java` (concrete `PackageDecorator.java` implementation which provides additional behaviour for retrieved properties)

**Usage Showcase**
- `PackageTest.java`