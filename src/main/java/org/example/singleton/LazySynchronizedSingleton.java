package org.example.singleton;

public class LazySynchronizedSingleton {
    private LazySynchronizedSingleton() {
    }

    private static LazySynchronizedSingleton instance;

    public static synchronized LazySynchronizedSingleton getInstance() {
        if (instance == null) {
            return instance = new LazySynchronizedSingleton();
        } else {
            return instance;
        }
    }
}
