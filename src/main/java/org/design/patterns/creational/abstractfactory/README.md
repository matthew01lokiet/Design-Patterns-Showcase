# Abstract Factory

## Characteristics
- Extension to the **factory pattern** idea.
- Allows instantiation of different `Products` with different **types** (multiple families of related objects).

## Use Cases
- When **factory pattern** is not enough and you are able to distinguish more than one family of related objects.

### Provided Example
UI Components

**Implementation**
- `factory` (package)
    - `IAbstractComponentFactory.java` (factory interface with contract for families of components instantiation)
    - `LinuxComponentFactory` (concrete factory complying with interface that instantiates components from **linux** family)
    - `MacComponentFactory` (concrete factory complying with interface that instantiates components from **mac** family)
    - `WindowsComponentFactory` (concrete factory complying with interface that instantiates components from **windows** family)
- `object` (package)
    - `IComponent.java` (interface with `void display()` method that every components needs to comply with)
    - `button` (package)
        - `Button.java` (abstract class for `button` component)
        - `ButtonSize.java` (enum denoting 3 different sizes of the `button`)
        - `linux` (package)
          - `LinuxButton.java` (concrete `button` implementation from **linux** family)
          - `LoadLinuxButtonAssets.java` (**linux** `button` dependencies)
        - `mac` (package)
          - `MacButton.java` (concrete `button` implementation from **mac** family)
          - `LoadMacButtonAssets.java` (**mac** `button` dependencies)
        - `windows` (package)
          - `WindowsButton.java` (concrete `button` implementation from **windows** family)
          - `LoadWindowsButtonAssets.java` (**windows** `button` dependencies)
    - `slider` (package)
        - `Slider.java` (abstract class for `slider` component)
        - `SliderWidth.java` (enum denoting 3 different widths of the `slider`)
        - `linux` (package)
          - `LinuxSlider.java` (concrete `slider` implementation from **linux** family)
          - `LoadLinuxSliderAssets.java` (**linux** `slider` dependencies)
        - `mac` (package)
          - `MacSlider.java` (concrete `slider` implementation from **mac** family)
          - `LoadMacSliderAssets.java` (**mac** `slider` dependencies)
        - `windows` (package)
          - `WindowsSlider.java` (concrete `slider` implementation from **windows** family)
          - `LoadWindowsSliderAssets.java` (**windows** `slider` dependencies)

**Usage Showcase**
- `ComponentTest.java` 