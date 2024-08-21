# Java-design-patterns-showcase
![Default Pipeline](https://github.com/matthew01lokiet/Java-design-patterns-showcase/actions/workflows/pipeline.yml/badge.svg)

Structure of the design patterns packages in `src.main.java.org.design.patterns`:
- `creational`
    - `factorymethod`
    - `abstractfactory`
    - `blochbuilder`
    - `prototype`
    - `singleton`
- `structural`
    - `adapter`
    - `facade`
    - `decorator`
- `behavioral`
    - `strategy`

Each design pattern package consists of short `README.md`, pattern implementation and corresponding unit tests in `src.test.java.org.design.patterns`.

**Disclaimer**: Work in progress - new patterns will be added over time.

## Cheatsheet - when to use what
### Creational
- **Factory Method**:
    - When object instantiation process is long or complicated.
    - When you are able to distinguish family of related objects, for which you might also want to add flexibility of interchangeability during runtime.
- **Abstract Factory**:
    - When factory method is not enough and you are able to distinguish more than one family of related objects.
- **Joshua Bloch Builder**:
    - When object constructor consists of many parameters (if some parameters are optional but others are required, it's strong indicator to use this pattern).
- **Prototype**:
    - When you want to outsource cloning logic from client side into object class itself (e.g. it might be too complicated to bother client).
    - When you want to make cloneable objects not dependable on theirs concrete classes.
- **Singleton**:
    - For loading initial configuration into object, that will be reused throughout application lifecycle.
    - For ensuring single instance of class, which might otherwise cause conflicts between instances (e.g. database connection).
### Behavioral
- **Strategy**:
    - When you have switch conditional for choosing algorithm used by the object.
    - When you want to allow object to change used algorithm dynamically during runtime.
    - When bunch of related classes differ only in used algorithms (so you can extract behaviours into objects and inject them into one base object).
### Structural:
- **Adapter**:
    - When your interfaces need to collaborate with 3rd party libraries.
    - When your interfaces need to collaborate with legacy, deprecated code (that you cannot change).
- **Facade**:
    - When underlying logic is too complex and should not be accessible directly (but rather functionalities provided by this logic through interface).
    - Most probably you do it on daily basis not even knowing this is a design pattern.
- **Decorator**:
    - When you want to compose different configurations of the object, but inheritance would be too strict.
    - When you want to attach new behaviour to the object dynamically during runtime.
