package org.design.patterns.structural.decorator.decoration;

import lombok.RequiredArgsConstructor;
import org.design.patterns.structural.decorator.object.Package;

@RequiredArgsConstructor
public abstract class PackageDecorator extends Package {

    protected final Package aPackage;
}
