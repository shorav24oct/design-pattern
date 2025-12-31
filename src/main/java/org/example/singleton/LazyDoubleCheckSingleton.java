package org.example.singleton;

public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton() {
    }

    private static LazyDoubleCheckSingleton instance;

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
