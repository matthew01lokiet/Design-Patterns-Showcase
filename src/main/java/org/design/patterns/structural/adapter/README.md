# Adapter

## Characteristics
- Allows **collaboration** of **incompatible interfaces** (which you cannot modify).
- Works by wrapping one of the chosen interfaces with `Adapter` object, which complies with the interface of another one.

## Use Cases
- Useful for 3rd libraries, where you cannot modify their interfaces, but you need to collaborate with them.
- Useful for cooperating with legacy code that is deprecated, but cannot be removed or changed.

### Provided Example
Universities Data Analytics

**Implementation**
- `adapter` (package)
  - `cambridge` (package)
    - `ICambridgeData.java` (cambridge service interface with `List<String> getUsersCsvData()` method)
    - `CambridgeDataApi.java` (concrete implementation of cambridge service interface)
    - `CambridgeDataFormatAdapter.java` (cambridge service adapter for oxford tsv data)
  - `oxford` (package)
    - `IOxfordData.java` (oxford service interface with `List<String> getUsersTsvData()` method)
    - `OxfordDataApi.java` (concrete implementation of oxford service interface)
    - `OxfordDataFormatAdapter.java` (oxford service adapter for cambridge csv data)

**Usage Showcase**
- `UserDataTest.java`