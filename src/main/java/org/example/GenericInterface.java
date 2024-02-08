package org.example;

@FunctionalInterface
interface GenericInterface<T> {

    // generic method
    T func(T t);
}
