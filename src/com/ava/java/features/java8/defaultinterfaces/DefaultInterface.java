package com.ava.java.features.java8.defaultinterfaces;

public interface DefaultInterface {

    void methodMustBeImplemented(String message);

    default void methodAlreadyImplemented(String message) {
        System.out.printf("This method is implemented already and contains the following message: %s\n", message);
    }

    static void staticMethodAlreadyImplemented(String message) {
        System.out.printf("This method is static, was implemented already, and contains the following message: %s\n", message);
    }
}
