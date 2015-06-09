package com.lesson4;

/**
 * Created by Вевдюк on 08.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Roman");
        human.sayHello();
        human.setAge(12);
        System.out.println("My name is " + human.getName() + " and i'm " + human.getAge() + " years old");

        //-----lesson5------

        ExampleStaticFieldClass exampleStaticFieldClass = new ExampleStaticFieldClass();
        exampleStaticFieldClass.staticField=4;

        ExampleStaticFieldClass exampleStaticFieldClass2 = new ExampleStaticFieldClass();
        exampleStaticFieldClass.staticField=5;

        System.out.println(exampleStaticFieldClass.staticField + ", " + exampleStaticFieldClass2.staticField);
        exampleStaticFieldClass.hello();
        ExampleStaticFieldClass.hello1();

        //-----lesson5.1------

        Field field = new Field();
        field.eraseField();
        field.showField();

        //-----lesson6-------;

        Field fieldNew = new Field(4);
        fieldNew.showField();

    }
}
