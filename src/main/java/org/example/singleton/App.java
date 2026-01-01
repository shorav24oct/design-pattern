package org.example.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println( "Hello World!" );

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton.hashCode());

        //LazySingleton lazySingleton1 = (LazySingleton) lazySingleton.clone();

        LazySingleton reflectionInstance = null;
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            reflectionInstance = (LazySingleton) constructor.newInstance();
        }

        System.out.println(reflectionInstance.hashCode());
    }
}
