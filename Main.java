package com.company;

import java.util.Random;

/*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
 В качестве параметра каждому методу передается величина, означающая или длину препятствия
 (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.
, собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
 (Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть
400 м., у другой 600 м.
 */
public class Main {
    public static void main(String[] args) {
	// write your code here
        Random rnd = new Random();
        System.out.println("\nA cat tries to:");
        Cat cat = new Cat(200,5,-1);
        Dog dog = new Dog(250,1,15);
        cat.jump(rnd.nextInt(10));
        cat.run(rnd.nextInt(300));
        cat.swim(rnd.nextInt(30));
        System.out.println("\nA dog tries to:");
        dog.jump(rnd.nextInt(10));
        dog.run(rnd.nextInt(300));
        dog.swim(rnd.nextInt(30));
    }
}
