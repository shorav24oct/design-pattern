package org.example;

import org.example.singleton.EagerSingleton;
import org.example.singleton.LazySingleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        LazySingleton eagerSingleton1 = LazySingleton.getInstance();
        System.out.println(eagerSingleton1.hashCode());

        LazySingleton eagerSingleton2 = LazySingleton.getInstance();
        System.out.println(eagerSingleton2.hashCode());
    }
}
