package org.example;

public class Dog {
    String name;
    String breed;
    int age;
    Dog(){}
    Dog(String breed){
        this.breed=breed;
    }
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
