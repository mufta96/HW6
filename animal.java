package com.company;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
/*2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина, означающая или длину препятствия
(для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок:
кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат
                в консоль. (Например, dog1.run(150); -> результат: run: true)
 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег
                может быть 400 м., у другой 600 м.
 */
public class animal {
    int run_limit;
    int jump_limit;
    int swim_limit;
public animal(int run_limit,  int jump_limit,  int swim_limit)
{
    this.run_limit=run_limit;
    this.jump_limit=jump_limit;
    this.swim_limit=swim_limit;
}
    public void run(int distance) {
        System.out.println((distance <= this.run_limit) ? "an animal ran " + distance + "m": "an animal couldn't ran");
    }

    public void jump(int distance) {
        System.out.println((distance <= this.jump_limit) ? "jump: true" : "jump: false");
    }

    public void swim(int distance) {
        System.out.println((distance <= this.swim_limit) ? "swim: true" : "swim: false");
    }


}

