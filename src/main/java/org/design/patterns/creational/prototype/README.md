# Prototype

## Characteristics
- Outsources object copying logic from client code to object class itself.
- Uses interface that object needs to implement to denote that it is copyable and provides method (most of the time named `clone()`)
for this functionality.

## Use cases
- When your class consist of fields that are not accessible outside this class (so client cannot copy them).
- When client convenience is your priority and he shouldn't be bothered with how to copy object.
- When you want to make cloneable objects not dependable on theirs concrete classes.

### Provided Example
User Details

**Implementation**
- `prototype` (package)
  - `user` (package)
    - `User.java` (class with user data that complies with `Cloneable` interface)
    - `UserDetails.java` (dependency of user that also complies with `Cloneable` interface)

**Usage Showcase**
- `UserTest.java` 