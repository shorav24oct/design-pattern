package org.example.singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException {
        System.out.println( "Hello World!" );

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton.hashCode());

        //LazySingleton lazySingleton1 = (LazySingleton) lazySingleton.clone();



        //System.out.println(lazySingleton1.hashCode());
    }
}
