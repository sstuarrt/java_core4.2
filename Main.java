package com.company.lesson5_classes.homework5.task3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Леопард", 7, 20);

        String name = animal.getName();
        int speed = animal.getSpeed();
        int age = animal.getAge();

        System.out.print("Назва тварини = " + name + ", ");
        System.out.print("Швидкість тварини = " + speed + " км/год" + ", ");
        System.out.println("Вік тварини = " + age + " років");

        Animal animal1 = new Animal();
        animal1.setName("Бик");
        animal1.setSpeed(2);
        animal1.setAge(14);

        System.out.println(animal1);
    }
}
