package linkedlist;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "[Name: " + name + " | Age: " + age + "]";
    }

    @Override
    public int compareTo(Person o) {
        return Comparator.comparing(Person::getName).thenComparingInt(Person::getAge).compare(this, o);
    }
}