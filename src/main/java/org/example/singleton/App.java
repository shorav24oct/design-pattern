package org.example.singleton;

public class App 
{
    public static void main( String[] args ) {

        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        instance1.perform();

        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        instance2.perform();

        System.out.println(instance1.hashCode() == instance2.hashCode());

    }
}
