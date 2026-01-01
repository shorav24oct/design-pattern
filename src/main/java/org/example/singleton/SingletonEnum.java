package org.example.singleton;

public enum SingletonEnum {

    INSTANCE;

    void perform() {
        System.out.println("Performing some task! " + INSTANCE.hashCode());
    }
}
