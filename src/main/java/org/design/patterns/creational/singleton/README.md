# Singleton

## Characteristics
- Provides global point of access to the instance of class.
- Ensures only zero or one instance exists at any given time.

## Use Cases
- For loading initial configuration into object, that will be reused throughout application lifecycle.
- For ensuring single instance of class, which might otherwise cause conflicts between instances (e.g. database
  connection).

### Provided Example
One Pope

**Implementation**
- `singleton` (package)
  - `Pope.java` (singleton class)

**Usage Showcase**
- `PopeTest.java`