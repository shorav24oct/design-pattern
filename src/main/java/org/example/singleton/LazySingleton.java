package org.example.singleton;

public class LazySingleton extends MyClone {

    private LazySingleton() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    private static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            return instance = new LazySingleton();
        } else {
            return instance;
        }
    }

}
