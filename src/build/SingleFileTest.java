package com.huajie.app.test;

import runtime.JhpRuntime;
class Person {
    public String name;
    public Integer age;
}
class PersonService {
    public  Person getPerson() 
    {
        Person person = new Person();
        person.name = "张三";
        person.age = 28;
        return person;
    }
    public  Double getBalance() 
    {
        return 100.0;
    }
}
class Box<T> {
    public T value;
    public  T getValue() 
    {
        return this.value;
    }
}
class SingleFileTest {
    public static void main(String[] args)    {
        PersonService service = new PersonService();
        Person person = service.getPerson();
        Double balance = service.getBalance();
        JhpRuntime.echo("姓名: ", person.name, "\\n");
        JhpRuntime.echo("年龄: ", person.age, "\\n");
        JhpRuntime.echo("余额: ", balance, "\\n");
        Box<Person> box = new Box<Person>();
        box.value = person;
        Person p = box.getValue();
        JhpRuntime.echo("再次确认姓名: ", p.name, "\\n");
    }
}
