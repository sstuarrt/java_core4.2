package com.company.lesson5_classes.homework5.task3;

public class Animal {
    private String name;
    private int age;
    private int speed;

    public Animal (String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public Animal(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Назва тварини = " + name + ", Швидкість тварини = "
                + speed + " км/год" + ", Вік тварини = " + age + " років";
    }
}
