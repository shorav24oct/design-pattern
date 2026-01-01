package org.example.singleton;

public class LazySingleton extends MyClone {


    private static LazySingleton instance;

    private LazySingleton() {
        if (instance != null)
            throw new IllegalStateException("Object can't be create using reflection");
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            return instance = new LazySingleton();
        } else {
            return instance;
        }
    }

}
