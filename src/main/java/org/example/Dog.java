package org.example;

import java.net.SocketOption;

public class Dog {
    String name;
    String breed;
    int age;
    public void bark(){
        System.out.println("Dog is berking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
