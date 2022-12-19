package com.ava.java.features.java8.defaultinterfaces;

public class DefaultInterfaceRunner implements DefaultInterface {

    @Override
    public void methodMustBeImplemented(String message) {
        System.out.printf("This method was implemented after inheriting it and contains the following message: %s\n", message);
    }

    public static void main(String[] args) {
        DefaultInterface runner = new DefaultInterfaceRunner();
        runner.methodAlreadyImplemented("Default method!");
        DefaultInterface.staticMethodAlreadyImplemented("Static default method!");
        runner.methodMustBeImplemented("Method implemented by inheritance!");
    }
}