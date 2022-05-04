# Strategy

## Characteristics
- Defines families of interchangeable algorithms (which are being wrapped into distinct objects).
- Allows injection of these algorithms into given object for later use depending on client needs.

## Use Cases
- Gets rid of switch conditional logic for choosing needed algorithms, which might pollute code quickly.
- When you have bunch of related algorithms that differ only in details and you might want to change them dynamically during runtime.
- If you see classes that differ only in behaviour - then you can extract behaviour into strategies and inject them only to one class object.

### Provided Example
Custom Integer Array

**Implementation**
- `strategy` (package)
  - `CustomIntegerArray.java` (base class to which strategies will be injected, stores int array)
  - `sort` (package)
    - `ISortingStrategy.java` (interface for sorting strategies)
    - `SelectionAscendingSortingStrategy.java` (concrete sorting strategy implementation)
    - `SelectionDescendingSortingStrategy.java` (concrete sorting strategy implementation)
  - `display` (package)
    - `IDisplayStrategy.java` (interface for displaying strategies)
    - `DisplayHorizontallyStrategy.java` (concrete display strategy implementation)
    - `DisplayVerticallyStrategy.java` (concrete display strategy implementation)

**Usage Showcase**
- `CustomArrayTest.java`