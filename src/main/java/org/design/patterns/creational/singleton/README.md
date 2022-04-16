# Singleton

## Characteristics
- Provides ❗**global point of access**❗ to the instance of class.
- Ensures ❗**only zero or one instance**❗ exists at any given time.

## Use Cases
- For loading initial configuration into object, that will be reused throughout application lifecycle.
- For ensuring single instance of class, which might otherwise cause conflicts between instances (e.g. database
  connection).

## Tips
- Ensure singleton proper synchronization in multi-threaded environment.
- Do not allow immutability, if you don't have to.

### Provided Example
There can be only one pope!
- `Pope.java` (Implementation)
- `PopeTest.java` (Usage showcase)