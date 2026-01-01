package org.example.singleton;

public class MySingleton {

    private static MySingleton instance;

    // protect from reflection
    private MySingleton() {
        throw new IllegalStateException("Object can't be create using reflection");
    }

    // protect from cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // protect from serialization
    protected Object readResolve() {
        return instance;
    }

    public static MySingleton getInstance() {
        if (instance == null) { // 1st Null Check
            synchronized (MySingleton.class) {
                if (instance == null) { // 2nd Null check
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}
